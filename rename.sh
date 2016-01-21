ARGS=("$@")
PROJECT_NAME=${ARGS[0]}
if [ -z "$PROJECT_NAME" ]; then
	echo Usage:
	echo \	sh rename.sh [New Name of Program]
	exit -1
fi

echo changing name to \"$PROJECT_NAME\"...
sed -i "s|ProcessingGame|$PROJECT_NAME|g" build.xml
sed -i "s|ProcessingGame|$PROJECT_NAME|g" src/*.java
ant clean
sed -i "s|ProcessingGame|$PROJECT_NAME|g" rename.sh
