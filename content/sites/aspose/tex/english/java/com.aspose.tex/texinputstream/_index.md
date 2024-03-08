---
title: TeXInputStream
second_title: Aspose.TeX for Java API Reference
description: The class that encapsulates TeX specific features of stream reading and associates the stream with its name.
type: docs
weight: 38
url: /java/com.aspose.tex/texinputstream/
---
**Inheritance:**
java.lang.Object, java.io.InputStream
```
public class TeXInputStream extends InputStream
```

The class that encapsulates TeX specific features of stream reading and associates the stream with its name.
## Constructors

| Constructor | Description |
| --- | --- |
| [TeXInputStream(InputStream in, String fullName)](#TeXInputStream-java.io.InputStream-java.lang.String-) | Creates a new instance. |
## Methods

| Method | Description |
| --- | --- |
| [getFullName()](#getFullName--) | Gets the full name of the stream. |
| [read()](#read--) | Reads the next byte of data from the input stream. |
| [read(byte[] b)](#read-byte---) | Reads some number of bytes from the input stream and stores them into the buffer array  b . |
| [read(byte[] b, int off, int len)](#read-byte---int-int-) | Reads up to  len  bytes of data from the input stream into an array of bytes. |
| [available()](#available--) | Returns an estimate of the number of bytes that can be read (or skipped over) from this input stream without blocking by the next invocation of a method for this input stream. |
| [markSupported()](#markSupported--) | Tests if this input stream supports the mark and reset methods. |
| [mark(int readlimit)](#mark-int-) | Marks the current position in this input stream. |
| [reset()](#reset--) | Repositions this stream to the position at the time the  mark  method was last called on this input stream. |
| [skip(long n)](#skip-long-) | Skips over and discards  n  bytes of data from this input stream. |
| [close()](#close--) | Sets the position of the underlying byte array stream to the beginning. |
### TeXInputStream(InputStream in, String fullName) {#TeXInputStream-java.io.InputStream-java.lang.String-}
```
public TeXInputStream(InputStream in, String fullName)
```


Creates a new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| in | java.io.InputStream | The Java native  InputStream  instance. |
| fullName | java.lang.String | The full name. |

### getFullName() {#getFullName--}
```
public String getFullName()
```


Gets the full name of the stream.

**Returns:**
java.lang.String - The full name of the stream.
### read() {#read--}
```
public int read()
```


Reads the next byte of data from the input stream. The value byte is returned as an  int  in the range  0  to  255 . If no byte is available because the end of the stream has been reached, the value  -1  is returned. This method blocks until input data is available, the end of the stream is detected, or an exception is thrown.

**Returns:**
int - The next byte of data, or  -1  if the end of the stream is reached.
### read(byte[] b) {#read-byte---}
```
public int read(byte[] b)
```


Reads some number of bytes from the input stream and stores them into the buffer array  b . The number of bytes actually read is returned as an integer. This method blocks until input data is available, end of file is detected, or an exception is thrown.

If the length of  b  is zero, then no bytes are read and  0  is returned; otherwise, there is an attempt to read at least one byte. If no byte is available because the stream is at the end of the file, the value  -1  is returned; otherwise, at least one byte is read and stored into  b .

The first byte read is stored into element  b[0] , the next one into  b[1] , and so on. The number of bytes read is, at most, equal to the length of  b . Let  k  be the number of bytes actually read; these bytes will be stored in elements  b[0]  through  b[k-1] , leaving elements  b[k]  through  b[b.length-1]  unaffected.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| b | byte[] | The buffer into which the data is read. |

**Returns:**
int - The total number of bytes read into the buffer, or  -1  if there is no more data because the end of the stream has been reached.
### read(byte[] b, int off, int len) {#read-byte---int-int-}
```
public int read(byte[] b, int off, int len)
```


Reads up to  len  bytes of data from the input stream into an array of bytes. An attempt is made to read as many as  len  bytes, but a smaller number may be read. he number of bytes actually read is returned as an integer.

This method blocks until input data is available, end of file is detected, or an exception is thrown.

If  len  is zero, then no bytes are read and  0  is returned; otherwise, there is an attempt to read at least one byte. If no byte is available because the stream is at end of file, the value  -1  is returned; otherwise, at least one byte is read and stored into  b .

The first byte read is stored into element  b[off] , the next one into  b[off+1] , and so on. The number of bytes read is, at most, equal to  len . Let  k  be the number of bytes actually read; these bytes will be stored in elements  b[off]  through  b[off+k-1] , leaving elements  b[off+k]  through  b[off+len-1]  unaffected.

In every case, elements  b[0]  through  b[off]  and elements  b[off+len]  through  b[b.length-1]  are unaffected.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| b | byte[] | The buffer into which the data is read. |
| off | int | The start offset in array b at which the data is written. |
| len | int | The maximum number of bytes to read. |

**Returns:**
int - The number of bytes actually read.
### available() {#available--}
```
public int available()
```


Returns an estimate of the number of bytes that can be read (or skipped over) from this input stream without blocking by the next invocation of a method for this input stream. The next invocation might be the same thread or another thread. A single read or skip of this many bytes will not block, but may read or skip fewer bytes.

**Returns:**
int - An estimate of the number of bytes that can be read (or skipped over) from this input stream without blocking or  0  when it reaches the end of the input stream.
### markSupported() {#markSupported--}
```
public boolean markSupported()
```


Tests if this input stream supports the mark and reset methods. Whether or not  mark  and  reset  are supported is an invariant property of a particular input stream instance.

**Returns:**
boolean -  true .
### mark(int readlimit) {#mark-int-}
```
public void mark(int readlimit)
```


Marks the current position in this input stream. A subsequent call to the  reset  method repositions this stream at the last marked position so that subsequent reads re-read the same bytes.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| readlimit | int | Tells this input stream to allow that many bytes to be read before the mark position gets invalidated. |

### reset() {#reset--}
```
public void reset()
```


Repositions this stream to the position at the time the  mark  method was last called on this input stream.

### skip(long n) {#skip-long-}
```
public long skip(long n)
```


Skips over and discards  n  bytes of data from this input stream. The  skip  method may, for a variety of reasons, end up skipping over some smaller number of bytes, possibly  0 . This may result from any of a number of conditions; reaching end of file before  n  bytes have been skipped is only one possibility. If  n  is negative, no bytes are skipped.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| n | long | The number of bytes to be skipped. |

**Returns:**
long - The actual number of bytes skipped.
### close() {#close--}
```
public void close()
```


Sets the position of the underlying byte array stream to the beginning.

