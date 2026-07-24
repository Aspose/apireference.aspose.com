---
title: "PdfEncryptionDetails"
second_title: "Aspose.Page용 Java API 참조"
description: "pdf 암호화에 대한 세부 정보를 포함합니다."
type: docs
weight: 13
url: /ko/java/com.aspose.xps.rendering/pdfencryptiondetails/
---
**Inheritance:**
java.lang.Object
```
public class PdfEncryptionDetails
```

pdf 암호화에 대한 세부 정보를 포함합니다.
## 생성자

| 생성자 | 설명 |
| --- | --- |
| [PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm)](#PdfEncryptionDetails-java.lang.String-java.lang.String-int-com.aspose.xps.rendering.PdfEncryptionAlgorithm-) | PdfEncryptionDetailsCore 클래스의 새 인스턴스를 초기화합니다. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getEncryptionAlgorithm()](#getEncryptionAlgorithm--) | 암호화 모드를 반환합니다. |
| [getOwnerPassword()](#getOwnerPassword--) | 소유자 비밀번호를 반환합니다. |
| [getPermissions()](#getPermissions--) | 권한을 반환합니다. |
| [getUserPassword()](#getUserPassword--) | 사용자 비밀번호를 반환합니다. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setEncryptionAlgorithm(PdfEncryptionAlgorithm value)](#setEncryptionAlgorithm-com.aspose.xps.rendering.PdfEncryptionAlgorithm-) | 암호화 모드를 설정합니다. |
| [setOwnerPassword(String value)](#setOwnerPassword-java.lang.String-) | 소유자 비밀번호를 설정합니다. |
| [setPermissions(int value)](#setPermissions-int-) | 권한을 설정합니다. |
| [setUserPassword(String value)](#setUserPassword-java.lang.String-) | 사용자 비밀번호를 설정합니다. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm) {#PdfEncryptionDetails-java.lang.String-java.lang.String-int-com.aspose.xps.rendering.PdfEncryptionAlgorithm-}
```
public PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm)
```


PdfEncryptionDetailsCore 클래스의 새 인스턴스를 초기화합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| userPassword | java.lang.String | 사용자 비밀번호입니다. |
| ownerPassword | java.lang.String | 소유자 비밀번호입니다. |
| permissions | int | 권한입니다. |
| encryptionAlgorithm | [PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) | 암호화 알고리즘입니다. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| 매개변수 | 유형 | 설명 |
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


암호화 모드를 반환합니다.

**Returns:**
[PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) - The encryption algorithm.
### getOwnerPassword() {#getOwnerPassword--}
```
public String getOwnerPassword()
```


소유자 비밀번호를 반환합니다.

올바른 소유자 비밀번호(사용자 비밀번호와 다르다고 가정)로 문서를 열면 문서에 대한 전체(소유자) 접근 권한이 부여됩니다. 이 무제한 접근 권한에는 문서\u2019의 비밀번호 및 접근 권한을 변경할 수 있는 기능이 포함됩니다.

**Returns:**
java.lang.String - 소유자 비밀번호.
### getPermissions() {#getPermissions--}
```
public int getPermissions()
```


권한을 반환합니다.

**Returns:**
int - 권한.
### getUserPassword() {#getUserPassword--}
```
public String getUserPassword()
```


사용자 비밀번호를 반환합니다.

올바른 사용자 비밀번호로 문서를 열면(또는 사용자 비밀번호가 없는 문서를 열 경우) 문서의 암호화 사전에서 지정된 사용자 접근 권한에 따라 추가 작업을 수행할 수 있습니다.

**Returns:**
java.lang.String - 사용자 비밀번호.
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


암호화 모드를 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| value | [PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) | 암호화 알고리즘입니다. |

### setOwnerPassword(String value) {#setOwnerPassword-java.lang.String-}
```
public void setOwnerPassword(String value)
```


소유자 비밀번호를 설정합니다.

올바른 소유자 비밀번호(사용자 비밀번호와 다르다고 가정)로 문서를 열면 문서에 대한 전체(소유자) 접근 권한이 부여됩니다. 이 무제한 접근 권한에는 문서\u2019의 비밀번호 및 접근 권한을 변경할 수 있는 기능이 포함됩니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | java.lang.String | 소유자 비밀번호입니다. |

### setPermissions(int value) {#setPermissions-int-}
```
public void setPermissions(int value)
```


권한을 설정합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | int | 권한입니다. |

### setUserPassword(String value) {#setUserPassword-java.lang.String-}
```
public void setUserPassword(String value)
```


사용자 비밀번호를 설정합니다.

올바른 사용자 비밀번호로 문서를 열면(또는 사용자 비밀번호가 없는 문서를 열 경우) 문서의 암호화 사전에서 지정된 사용자 접근 권한에 따라 추가 작업을 수행할 수 있습니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 값 | java.lang.String | 사용자 비밀번호입니다. |

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
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

