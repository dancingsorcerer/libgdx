// @DSG:PMS -- Added this entire file.  This is a simple interface for
//			   an external object that wishes to wrap all opened 
//			   FileInputStreams (to decrypt encrypted files, for example).
//			   See FileHandle.java for usage.

package com.badlogic.gdx.files;

import java.io.InputStream;

public interface FileHandleInputStreamProcessor {
	public InputStream process(FileHandle fh, InputStream in);
}
