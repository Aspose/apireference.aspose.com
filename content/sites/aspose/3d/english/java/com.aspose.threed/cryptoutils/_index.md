---
title: CryptoUtils
second_title: Aspose.3D for Java API Reference
description: 
type: docs
weight: 31
url: /java/com.aspose.threed/cryptoutils/
---

**Inheritance:**
java.lang.Object
```
public class CryptoUtils
```
## Constructors

| Constructor | Description |
| --- | --- |
| [CryptoUtils()](#CryptoUtils--) |  |
## Methods

| Method | Description |
| --- | --- |
| [sha1(String str)](#sha1-java.lang.String-) |  |
| [desDecrypt(byte[] data, byte[] key, byte[] iv)](#desDecrypt-byte---byte---byte---) |  |
| [desEncrypt(byte[] data, byte[] key, byte[] iv)](#desEncrypt-byte---byte---byte---) |  |
### CryptoUtils() {#CryptoUtils--}
```
public CryptoUtils()
```


### sha1(String str) {#sha1-java.lang.String-}
```
public static byte[] sha1(String str)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| str | java.lang.String |  |

**Returns:**
byte[]
### desDecrypt(byte[] data, byte[] key, byte[] iv) {#desDecrypt-byte---byte---byte---}
```
public static byte[] desDecrypt(byte[] data, byte[] key, byte[] iv)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| data | byte[] |  |
| key | byte[] |  |
| iv | byte[] |  |

**Returns:**
byte[]
### desEncrypt(byte[] data, byte[] key, byte[] iv) {#desEncrypt-byte---byte---byte---}
```
public static byte[] desEncrypt(byte[] data, byte[] key, byte[] iv)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| data | byte[] |  |
| key | byte[] |  |
| iv | byte[] |  |

**Returns:**
byte[]
