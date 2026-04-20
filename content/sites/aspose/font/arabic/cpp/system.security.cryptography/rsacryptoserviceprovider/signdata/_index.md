---
title: "System::Security::Cryptography::RSACryptoServiceProvider::SignData طريقة"
linktitle: "SignData"
second_title: "Aspose.Font لـ C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::SignData طريقة. يحسب توقيع القيمة المدخلة المحددة في C++."
type: docs
weight: 1600
url: /ar/cpp/system.security.cryptography/rsacryptoserviceprovider/signdata/
---
## RSACryptoServiceProvider::SignData(const ByteArrayPtr\&, const SharedPtr\<Object\>\&) method


يحسب التوقيع للقيمة المدخلة المحددة.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignData(const ByteArrayPtr &buffer, const SharedPtr<Object> &halg)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Buffer](../../../system/buffer/) لقراءة البيانات المدخلة من. |
| halg | const SharedPtr\<Object\>\& | خوارزمية التجزئة للاستخدام. |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSACryptoServiceProvider::SignData(const ByteArrayPtr\&, int32_t, int32_t, const SharedPtr\<Object\>\&) method


يحسب التوقيع للقيمة المدخلة المحددة.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignData(const ByteArrayPtr &buffer, int32_t offset, int32_t count, const SharedPtr<Object> &halg)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Buffer](../../../system/buffer/) لقراءة البيانات المدخلة من. |
| إزاحة | int32_t | فهرس بداية شريحة المخزن المؤقت للمدخلات. |
| count | int32_t | حجم شريحة المخزن المؤقت للمدخلات. |
| halg | const SharedPtr\<Object\>\& | خوارزمية التجزئة للاستخدام. |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSACryptoServiceProvider::SignData(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Object\>\&) method


يحسب التوقيع للقيمة المدخلة المحددة.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignData(const SharedPtr<IO::Stream> &input_stream, const SharedPtr<Object> &halg)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| input_stream | const SharedPtr\<IO::Stream\>\& | دفق لقراءة البيانات الموقعة منه. |
| halg | const SharedPtr\<Object\>\& | خوارزمية التجزئة للاستخدام. |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
