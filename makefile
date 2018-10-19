DemoPlayList.class : DemoPlayList.java
	javac DemoPlayList.java 
run : DemoPlayList.class 
	java DemoPlayList
clean : 
	rm DemoPlayList.class
	rm Advertisement.class
	rm BasicPlayList.class
	rm Song.class
	rm PlayList.class
	rm Item.class