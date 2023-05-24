package com.simeio.fun;

interface Compressor{
	void compressfile(String filename);
}


public class FunDemo {
	public static void main(String[] args) {
		//	for compressor
		//	Compressor compress=(filename)->{
		//		System.out.println("file name is "+filename);	
		//	};
		//	compress.compressfile("zip file");
		//}

		Convertor convert=new Convertor();
		convert.convertFile("demo.txt", fileName->{
			System.out.println("Compressing to ZipFile"+fileName);
		});


	}
}