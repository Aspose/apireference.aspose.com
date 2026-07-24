---
title: "System::Int32::TryParse yöntemi"
linktitle: "TryParse"
second_title: "Aspose.Page için C++"
description: "C++'ta System::Int32 sınıfının TryParse yöntemini nasıl kullanılır."
type: docs
weight: 200
url: /tr/cpp/system/int32/tryparse/
---
## Int32::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, int32_t\&) method




```cpp
static bool System::Int32::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture, int32_t &result)
```

## Ayrıca Bakınız

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int32::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, int32_t\&) method




```cpp
static bool System::Int32::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi, int32_t &result)
```

## Ayrıca Bakınız

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int32::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, int32_t\&) method


Belirtilen sayının dize temsili içeren dizeyi sağlanan biçimlendirme bilgileri ve sayı stili kullanarak eşdeğer 32-bit işaretli tam sayıya dönüştürür.

```cpp
static bool System::Int32::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, int32_t &result)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| değer | const String\& | Dönüştürülecek dize. |
| styles | Globalization::NumberStyles | Bir sayının dize temsili için izin verilen stili belirten NumberStyles enum değerlerinin bit düzeyinde birleşimi. |
| sağlayıcı | const SharedPtr\<IFormatProvider\>\& | Dize biçim bilgilerini içeren bir nesneye işaretçi. |
| sonuç | int32_t\& | Dönüşüm sonucunun yerleştirildiği 32-bit işaretli tam sayı değişkenine referans. |

### ReturnValue

Dönüşüm başarılıysa true, aksi takdirde false.

## Ayrıca Bakınız

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int32::TryParse(const String\&, Globalization::NumberStyles, std::nullptr_t, int32_t\&) method




```cpp
static bool System::Int32::TryParse(const String &value, Globalization::NumberStyles styles, std::nullptr_t, int32_t &result)
```

## Ayrıca Bakınız

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Int32::TryParse(const String\&, int32_t\&) method


Belirtilen sayının dize temsili içeren dizeyi eşdeğer 32-bit işaretli tam sayıya dönüştürür.

```cpp
static bool System::Int32::TryParse(const String &value, int32_t &result)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| değer | const String\& | Dönüştürülecek dize. |
| sonuç | int32_t\& | Dönüşüm sonucunun yerleştirildiği 32-bit işaretli tam sayı değişkenine referans. |

### ReturnValue

Dönüşüm başarılıysa true, aksi takdirde false.

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
