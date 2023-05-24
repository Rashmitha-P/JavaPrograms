package com.simeio.fun;

 class Convertor {
	
void convertFile(String fileName,Compressor compressor)
{
	System.out.println("convert file  :"+ fileName);
	compressor.compressfile(fileName);
	System.out.println("Completed");
}
}

