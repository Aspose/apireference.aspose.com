---
title: NondisposableOutputStream
second_title: Aspose.TeX for Java API Reference
description: The class that encapsulates a stream that cannot be closed by calling the OutputStream.close method.
type: docs
weight: 21
url: /java/com.aspose.tex/nondisposableoutputstream/
---
**Inheritance:**
java.lang.Object, java.io.OutputStream
```
public class NondisposableOutputStream extends OutputStream
```

The class that encapsulates a stream that cannot be closed by calling the  OutputStream.close()  method.
## Constructors

| Constructor | Description |
| --- | --- |
| [NondisposableOutputStream()](#NondisposableOutputStream--) | Creates a new instance. |
## Methods

| Method | Description |
| --- | --- |
| [write(int value)](#write-int-) | Writes the specified byte to this output stream. |
| [write(byte[] b)](#write-byte---) | Writes  b.length  bytes from the specified byte array to this output stream. |
| [write(byte[] b, int off, int len)](#write-byte---int-int-) | Writes  len  bytes from the specified byte array starting at offset  off  to this output stream. |
| [flush()](#flush--) | Flushes this output stream and forces any buffered output bytes to be written out. |
| [close()](#close--) | Sets the position of the underlying byte array stream to the beginning. |
| [getByteArray()](#getByteArray--) | Returns the stream content as a byte array. |
### NondisposableOutputStream() {#NondisposableOutputStream--}
```
public NondisposableOutputStream()
```


Creates a new instance.

### write(int value) {#write-int-}
```
public void write(int value)
```


Writes the specified byte to this output stream.

The general contract for  write  is that one byte is written to the output stream. The byte to be written is the eight low-order bits of the argument  b . The  24  high-order bits of  b  are ignored.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The byte to write. |

### write(byte[] b) {#write-byte---}
```
public void write(byte[] b)
```


Writes  b.length  bytes from the specified byte array to this output stream.

The general contract for  write(b)  is that it should have exactly the same effect as the call  write(b, 0, b.length) .

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| b | byte[] | The data array. |

### write(byte[] b, int off, int len) {#write-byte---int-int-}
```
public void write(byte[] b, int off, int len)
```


Writes  len  bytes from the specified byte array starting at offset  off  to this output stream.

The general contract for  write(b, off, len)  is that some of the bytes in the array  b  are written to the output stream in order; element  b[off]  is the first byte written and  b[off+len-1]  is the last byte written by this operation.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| b | byte[] | The data array. |
| off | int | The start offset in the data. |
| len | int | The number of bytes to write. |

### flush() {#flush--}
```
public void flush()
```


Flushes this output stream and forces any buffered output bytes to be written out.

The general contract of  flush  is that calling it is an indication that, if any bytes previously written have been buffered by the implementation of the output stream, such bytes should immediately be written to their intended destination.

### close() {#close--}
```
public void close()
```


Sets the position of the underlying byte array stream to the beginning.

### getByteArray() {#getByteArray--}
```
public byte[] getByteArray()
```


Returns the stream content as a byte array.

**Returns:**
byte[] - A byte array with the stream content.
