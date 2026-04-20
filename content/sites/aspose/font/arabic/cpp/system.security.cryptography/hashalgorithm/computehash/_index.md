---
title: "طريقة System::Security::Cryptography::HashAlgorithm::ComputeHash"
linktitle: "ComputeHash"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Security::Cryptography::HashAlgorithm::ComputeHash. تقوم بتجزئة المخزن في C++."
type: docs
weight: 200
url: /ar/cpp/system.security.cryptography/hashalgorithm/computehash/
---
## HashAlgorithm::ComputeHash(const ArrayPtr\<uint8_t\>\&) method


يحسب تجزئة للذاكرة المؤقتة.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::ComputeHash(const ArrayPtr<uint8_t> &buffer)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | مخزن المصدر. |

### ReturnValue

قيمة التجزئة المحسوبة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## HashAlgorithm::ComputeHash(const ArrayPtr\<uint8_t\>\&, int, int) method


يحسب تجزئة لشريحة من الذاكرة المؤقتة.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::ComputeHash(const ArrayPtr<uint8_t> &buffer, int offset, int count)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | مخزن المصدر. |
| إزاحة | int | الإزاحة في المخزن المؤقت المصدر. |
| count | int | عدد البايتات التي سيتم استخدامها من المخزن المؤقت المصدر. |

### ReturnValue

قيمة التجزئة المحسوبة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## HashAlgorithm::ComputeHash(SharedPtr\<IO::Stream\> const\&) method


يقرأ الدفق حتى النهاية ويحسب تجزئة للبيانات المقروءة.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::ComputeHash(SharedPtr<IO::Stream> const &inputStream)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| inputStream | SharedPtr\<IO::Stream\> const\& | دفق لقراءة البيانات منه. |

### ReturnValue

قيمة التجزئة المحسوبة لكامل بيانات الدفق.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
