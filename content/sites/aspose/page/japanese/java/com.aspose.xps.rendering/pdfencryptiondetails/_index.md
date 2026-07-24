---
title: "PdfEncryptionDetails"
second_title: "Aspose.Page for Java API リファレンス"
description: "PDF 暗号化の詳細が含まれています。"
type: docs
weight: 13
url: /ja/java/com.aspose.xps.rendering/pdfencryptiondetails/
---
**Inheritance:**
java.lang.Object
```
public class PdfEncryptionDetails
```

PDF 暗号化の詳細が含まれています。
## コンストラクタ

| コンストラクタ | 説明 |
| --- | --- |
| [PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm)](#PdfEncryptionDetails-java.lang.String-java.lang.String-int-com.aspose.xps.rendering.PdfEncryptionAlgorithm-) | PdfEncryptionDetailsCore クラスの新しいインスタンスを初期化します。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getEncryptionAlgorithm()](#getEncryptionAlgorithm--) | 暗号化モードを返します。 |
| [getOwnerPassword()](#getOwnerPassword--) | 所有者パスワードを返します。 |
| [getPermissions()](#getPermissions--) | アクセス許可を返します。 |
| [getUserPassword()](#getUserPassword--) | ユーザー パスワードを返します。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setEncryptionAlgorithm(PdfEncryptionAlgorithm value)](#setEncryptionAlgorithm-com.aspose.xps.rendering.PdfEncryptionAlgorithm-) | 暗号化モードを設定します。 |
| [setOwnerPassword(String value)](#setOwnerPassword-java.lang.String-) | 所有者パスワードを設定します。 |
| [setPermissions(int value)](#setPermissions-int-) | アクセス許可を設定します。 |
| [setUserPassword(String value)](#setUserPassword-java.lang.String-) | ユーザー パスワードを設定します。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm) {#PdfEncryptionDetails-java.lang.String-java.lang.String-int-com.aspose.xps.rendering.PdfEncryptionAlgorithm-}
```
public PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm)
```


PdfEncryptionDetailsCore クラスの新しいインスタンスを初期化します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| userPassword | java.lang.String | ユーザー パスワードです。 |
| ownerPassword | java.lang.String | 所有者パスワードです。 |
| permissions | int | アクセス許可です。 |
| encryptionAlgorithm | [PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) | 暗号化アルゴリズムです。 |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| パラメータ | 型 | 説明 |
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


暗号化モードを返します。

**Returns:**
[PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) - The encryption algorithm.
### getOwnerPassword() {#getOwnerPassword--}
```
public String getOwnerPassword()
```


所有者パスワードを返します。

正しい所有者パスワードでドキュメントを開くと（ユーザーパスワードと同じでないと仮定して）、ドキュメントへの完全な（所有者）アクセスが可能になります。この無制限のアクセスには、ドキュメント\\u2019s のパスワードとアクセス許可を変更する機能が含まれます。

**Returns:**
java.lang.String - 所有者パスワード。
### getPermissions() {#getPermissions--}
```
public int getPermissions()
```


アクセス許可を返します。

**Returns:**
int - 権限。
### getUserPassword() {#getUserPassword--}
```
public String getUserPassword()
```


ユーザー パスワードを返します。

正しいユーザーパスワードでドキュメントを開く（またはユーザーパスワードが設定されていないドキュメントを開く）ことで、ドキュメントの暗号化辞書に指定されたユーザーアクセス権限に従って追加の操作を実行できるようになります。

**Returns:**
java.lang.String - ユーザーパスワード。
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


暗号化モードを設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | [PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) | 暗号化アルゴリズムです。 |

### setOwnerPassword(String value) {#setOwnerPassword-java.lang.String-}
```
public void setOwnerPassword(String value)
```


所有者パスワードを設定します。

正しい所有者パスワードでドキュメントを開くと（ユーザーパスワードと同じでないと仮定して）、ドキュメントへの完全な（所有者）アクセスが可能になります。この無制限のアクセスには、ドキュメント\\u2019s のパスワードとアクセス許可を変更する機能が含まれます。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | java.lang.String | 所有者パスワードです。 |

### setPermissions(int value) {#setPermissions-int-}
```
public void setPermissions(int value)
```


アクセス許可を設定します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | int | アクセス許可です。 |

### setUserPassword(String value) {#setUserPassword-java.lang.String-}
```
public void setUserPassword(String value)
```


ユーザー パスワードを設定します。

正しいユーザーパスワードでドキュメントを開く（またはユーザーパスワードが設定されていないドキュメントを開く）ことで、ドキュメントの暗号化辞書に指定されたユーザーアクセス権限に従って追加の操作を実行できるようになります。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| value | java.lang.String | ユーザー パスワードです。 |

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
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

