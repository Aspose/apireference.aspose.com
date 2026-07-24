---
title: "System::Security::Cryptography::RSACryptoServiceProvider::SignData μέθοδος"
linktitle: "SignData"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::SignData μέθοδος. Υπολογίζει την υπογραφή της καθορισμένης τιμής εισόδου σε C++."
type: docs
weight: 1600
url: /el/cpp/system.security.cryptography/rsacryptoserviceprovider/signdata/
---
## RSACryptoServiceProvider::SignData(const ByteArrayPtr\&, const SharedPtr\<Object\>\&) method


Υπολογίζει την υπογραφή της καθορισμένης τιμής εισόδου.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignData(const ByteArrayPtr &buffer, const SharedPtr<Object> &halg)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Buffer](../../../system/buffer/) για ανάγνωση δεδομένων εισόδου από. |
| halg | const SharedPtr\<Object\>\& | Αλγόριθμος κατακερματισμού προς χρήση. |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## Δείτε επίσης

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::SignData(const ByteArrayPtr\&, int32_t, int32_t, const SharedPtr\<Object\>\&) method


Υπολογίζει την υπογραφή της καθορισμένης τιμής εισόδου.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignData(const ByteArrayPtr &buffer, int32_t offset, int32_t count, const SharedPtr<Object> &halg)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Buffer](../../../system/buffer/) για ανάγνωση δεδομένων εισόδου από. |
| offset | int32_t | Αρχικός δείκτης τμήματος του buffer εισόδου. |
| count | int32_t | Μέγεθος τμήματος του buffer εισόδου. |
| halg | const SharedPtr\<Object\>\& | Αλγόριθμος κατακερματισμού προς χρήση. |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## Δείτε επίσης

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::SignData(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Object\>\&) method


Υπολογίζει την υπογραφή της καθορισμένης τιμής εισόδου.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignData(const SharedPtr<IO::Stream> &input_stream, const SharedPtr<Object> &halg)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| input_stream | const SharedPtr\<IO::Stream\>\& | Ροή για ανάγνωση των δεδομένων που υπογράφονται. |
| halg | const SharedPtr\<Object\>\& | Αλγόριθμος κατακερματισμού προς χρήση. |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## Δείτε επίσης

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
