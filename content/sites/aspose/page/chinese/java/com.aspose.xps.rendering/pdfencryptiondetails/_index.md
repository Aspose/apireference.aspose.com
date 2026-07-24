---
title: "PdfEncryptionDetails"
second_title: "Aspose.Page for Java API 参考"
description: "包含 pdf 加密的详细信息。"
type: docs
weight: 13
url: /zh/java/com.aspose.xps.rendering/pdfencryptiondetails/
---
**Inheritance:**
java.lang.Object
```
public class PdfEncryptionDetails
```

包含 pdf 加密的详细信息。
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm)](#PdfEncryptionDetails-java.lang.String-java.lang.String-int-com.aspose.xps.rendering.PdfEncryptionAlgorithm-) | 初始化 PdfEncryptionDetailsCore 类的新实例。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getEncryptionAlgorithm()](#getEncryptionAlgorithm--) | 返回加密模式。 |
| [getOwnerPassword()](#getOwnerPassword--) | 返回所有者密码。 |
| [getPermissions()](#getPermissions--) | 返回权限。 |
| [getUserPassword()](#getUserPassword--) | 返回用户密码。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setEncryptionAlgorithm(PdfEncryptionAlgorithm value)](#setEncryptionAlgorithm-com.aspose.xps.rendering.PdfEncryptionAlgorithm-) | 设置加密模式。 |
| [setOwnerPassword(String value)](#setOwnerPassword-java.lang.String-) | 设置所有者密码。 |
| [setPermissions(int value)](#setPermissions-int-) | 设置权限。 |
| [setUserPassword(String value)](#setUserPassword-java.lang.String-) | 设置用户密码。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm) {#PdfEncryptionDetails-java.lang.String-java.lang.String-int-com.aspose.xps.rendering.PdfEncryptionAlgorithm-}
```
public PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm)
```


初始化 PdfEncryptionDetailsCore 类的新实例。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| userPassword | java.lang.String | 用户密码。 |
| ownerPassword | java.lang.String | 所有者密码。 |
| permissions | int | 权限。 |
| encryptionAlgorithm | [PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) | 加密算法。 |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getEncryptionAlgorithm() {#getEncryptionAlgorithm--}
```
public PdfEncryptionAlgorithm getEncryptionAlgorithm()
```


返回加密模式。

**Returns:**
[PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) - The encryption algorithm.
### getOwnerPassword() {#getOwnerPassword--}
```
public String getOwnerPassword()
```


返回所有者密码。

使用正确的所有者密码打开文档（假设它与用户密码不同）可获得对文档的完整（所有者）访问权限。此无限制的访问包括更改文档\u2019s 密码和访问权限的能力。

**Returns:**
java.lang.String - 所有者密码。
### getPermissions() {#getPermissions--}
```
public int getPermissions()
```


返回权限。

**Returns:**
int - 权限。
### getUserPassword() {#getUserPassword--}
```
public String getUserPassword()
```


返回用户密码。

使用正确的用户密码打开文档（或打开没有用户密码的文档）可根据文档\\u2019s 加密字典中指定的用户访问权限执行额外的操作。

**Returns:**
java.lang.String - 用户密码。
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




### setEncryptionAlgorithm(PdfEncryptionAlgorithm value) {#setEncryptionAlgorithm-com.aspose.xps.rendering.PdfEncryptionAlgorithm-}
```
public void setEncryptionAlgorithm(PdfEncryptionAlgorithm value)
```


设置加密模式。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | [PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) | 加密算法。 |

### setOwnerPassword(String value) {#setOwnerPassword-java.lang.String-}
```
public void setOwnerPassword(String value)
```


设置所有者密码。

使用正确的所有者密码打开文档（假设它与用户密码不同）可获得对文档的完整（所有者）访问权限。此无限制的访问包括更改文档\u2019s 密码和访问权限的能力。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | java.lang.String | 所有者密码。 |

### setPermissions(int value) {#setPermissions-int-}
```
public void setPermissions(int value)
```


设置权限。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | int | 权限。 |

### setUserPassword(String value) {#setUserPassword-java.lang.String-}
```
public void setUserPassword(String value)
```


设置用户密码。

使用正确的用户密码打开文档（或打开没有用户密码的文档）可根据文档\\u2019s 加密字典中指定的用户访问权限执行额外的操作。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | java.lang.String | 用户密码。 |

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
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

