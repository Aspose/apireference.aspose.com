---
title: PubException
second_title: Aspose.PUB for Java API Reference
description: Represents errors that occur during PUB application execution.
type: docs
weight: 11
url: /java/com.aspose.pub.exceptions/pubexception/
---
**Inheritance:**
java.lang.Object, java.lang.Throwable, java.lang.Exception, java.lang.RuntimeException, com.aspose.ms.System.Exception, com.aspose.ms.System.ApplicationException
```
public class PubException extends System.ApplicationException
```

Represents errors that occur during PUB application execution.
## Constructors

| Constructor | Description |
| --- | --- |
| [PubException(String message)](#PubException-java.lang.String-) | Initializes a new instance of the [PubException](../../com.aspose.pub.exceptions/pubexception) class. |
| [PubException(String message, Throwable innerException)](#PubException-java.lang.String-java.lang.Throwable-) | Initializes a new instance of the [PubException](../../com.aspose.pub.exceptions/pubexception) class with a specified error message and a reference to the inner exception that is the cause of this exception. |
## Methods

| Method | Description |
| --- | --- |
| [getMessage()](#getMessage--) | Gets a message that describes the current exception. |
### PubException(String message) {#PubException-java.lang.String-}
```
public PubException(String message)
```


Initializes a new instance of the [PubException](../../com.aspose.pub.exceptions/pubexception) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| message | java.lang.String | The message. |

### PubException(String message, Throwable innerException) {#PubException-java.lang.String-java.lang.Throwable-}
```
public PubException(String message, Throwable innerException)
```


Initializes a new instance of the [PubException](../../com.aspose.pub.exceptions/pubexception) class with a specified error message and a reference to the inner exception that is the cause of this exception.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| message | java.lang.String | The error message that explains the reason for the exception. |
| innerException | java.lang.Throwable | The exception that is the cause of the current exception, or a null reference (Nothing in Visual Basic) if no inner exception is specified. |

### getMessage() {#getMessage--}
```
public String getMessage()
```


Gets a message that describes the current exception.

**Returns:**
java.lang.String
