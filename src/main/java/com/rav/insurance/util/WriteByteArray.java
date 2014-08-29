package com.rav.insurance.util;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class WriteByteArray {

	public static void writeByteArray(String fileName, byte[] array) {

		BufferedOutputStream bs = null;

		try {

			FileOutputStream fs = new FileOutputStream(new File(fileName));
			bs = new BufferedOutputStream(fs);
			bs.write(array);
			bs.close();
			bs = null;

		} catch (Exception e) {
			e.printStackTrace();
		}

		if (bs != null)
			try {
				bs.close();
			} catch (Exception e) {
			}
	}
}
