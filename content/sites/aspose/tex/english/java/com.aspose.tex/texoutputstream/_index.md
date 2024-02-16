---
title: TeXOutputStream
second_title: Aspose.TeX for Java API Reference
description: The class that associates an output stream of a random nature with a name.
type: docs
weight: 42
url: /java/com.aspose.tex/texoutputstream/
---
**Inheritance:**
java.lang.Object
```
public final class TeXOutputStream
```

The class that associates an output stream of a random nature with a name.
## Constructors

| Constructor | Description |
| --- | --- |
| [TeXOutputStream(OutputStream stream, String fullName)](#TeXOutputStream-java.io.OutputStream-java.lang.String-) | Creates a new instance. |
## Methods

| Method | Description |
| --- | --- |
| [getFullName()](#getFullName--) | Gets the full name of the stream. |
| [getStream()](#getStream--) | Gets the output stream itself. |
| [close()](#close--) | Closes the current instance. |
### TeXOutputStream(OutputStream stream, String fullName) {#TeXOutputStream-java.io.OutputStream-java.lang.String-}
```
public TeXOutputStream(OutputStream stream, String fullName)
```


Creates a new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| stream | java.io.OutputStream | The Java native  OutputStream  instance. |
| fullName | java.lang.String | The full name of the stream. |

### getFullName() {#getFullName--}
```
public String getFullName()
```


Gets the full name of the stream.

**Returns:**
java.lang.String - The full name of the stream
### getStream() {#getStream--}
```
public OutputStream getStream()
```


Gets the output stream itself.

**Returns:**
java.io.OutputStream - The output stream itself.
### close() {#close--}
```
public void close()
```


Closes the current instance.

