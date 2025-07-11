---
title: ThreadSearchConditions
second_title: Aspose.Email for Java API Reference
description: Provides the search conditions to retrieve email thread.
type: docs
weight: 709
url: /java/com.aspose.email/threadsearchconditions/
---

**Inheritance:**
java.lang.Object, [com.aspose.email.BaseSearchConditions](../../com.aspose.email/basesearchconditions)
```
public final class ThreadSearchConditions extends BaseSearchConditions
```

Provides the search conditions to retrieve email thread. Compatibles with THREAD IMAP extension described at https://tools.ietf.org/html/rfc5256
## Constructors

| Constructor | Description |
| --- | --- |
| [ThreadSearchConditions()](#ThreadSearchConditions--) |  |
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAlgorithm()](#getAlgorithm--) | Gets or sets threading algorithm supported by the IMAP server. |
| [getCharset()](#getCharset--) | Gets or sets charset. |
| [getClass()](#getClass--) |  |
| [getSince()](#getSince--) | Gets or sets the message date since which the search criteria matches. |
| [getText()](#getText--) | Gets or sets subject text. |
| [getUseUId()](#getUseUId--) | Gets or sets a value indicating whether the search method returns sequence numbers or UIDs of messages. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAlgorithm(String value)](#setAlgorithm-java.lang.String-) | Gets or sets threading algorithm supported by the IMAP server. |
| [setCharset(String value)](#setCharset-java.lang.String-) | Gets or sets charset. |
| [setSince(Date value)](#setSince-java.util.Date-) | Gets or sets the message date since which the search criteria matches. |
| [setText(String value)](#setText-java.lang.String-) | Gets or sets subject text. |
| [setUseUId(boolean value)](#setUseUId-boolean-) | Gets or sets a value indicating whether the search method returns sequence numbers or UIDs of messages. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ThreadSearchConditions() {#ThreadSearchConditions--}
```
public ThreadSearchConditions()
```


### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getAlgorithm() {#getAlgorithm--}
```
public final String getAlgorithm()
```


Gets or sets threading algorithm supported by the IMAP server.

**Returns:**
java.lang.String
### getCharset() {#getCharset--}
```
public final String getCharset()
```


Gets or sets charset. Indicates the charset of the strings that appear in the searching criteria.

**Returns:**
java.lang.String
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getSince() {#getSince--}
```
public final Date getSince()
```


Gets or sets the message date since which the search criteria matches.

**Returns:**
java.util.Date
### getText() {#getText--}
```
public final String getText()
```


Gets or sets subject text.

**Returns:**
java.lang.String
### getUseUId() {#getUseUId--}
```
public final boolean getUseUId()
```


Gets or sets a value indicating whether the search method returns sequence numbers or UIDs of messages.

**Returns:**
boolean
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setAlgorithm(String value) {#setAlgorithm-java.lang.String-}
```
public final void setAlgorithm(String value)
```


Gets or sets threading algorithm supported by the IMAP server.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String |  |

### setCharset(String value) {#setCharset-java.lang.String-}
```
public final void setCharset(String value)
```


Gets or sets charset. Indicates the charset of the strings that appear in the searching criteria.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String |  |

### setSince(Date value) {#setSince-java.util.Date-}
```
public final void setSince(Date value)
```


Gets or sets the message date since which the search criteria matches.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.util.Date |  |

### setText(String value) {#setText-java.lang.String-}
```
public final void setText(String value)
```


Gets or sets subject text.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String |  |

### setUseUId(boolean value) {#setUseUId-boolean-}
```
public final void setUseUId(boolean value)
```


Gets or sets a value indicating whether the search method returns sequence numbers or UIDs of messages.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean |  |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

