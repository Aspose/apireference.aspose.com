---
title: "System::Int32::TryParse metodu"
linktitle: "TryParse"
second_title: "Aspose.Font için C++"
description: "C++'da System::Int32 sınıfının TryParse metodunu nasıl kullanılır."
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
* Library [Aspose.Font for C++](../../../)
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
* Library [Aspose.Font for C++](../../../)
## Int32::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, int32_t\&) method


Belirtilen sayının dize temsili içeren dizeyi, sağlanan biçimlendirme bilgileri ve sayı stili kullanılarak eşdeğer 32-bit işaretli tam sayıya dönüştürür.

```cpp
static bool System::Int32::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, int32_t &result)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | const String\& | Dönüştürülecek dize. |
| styles | Globalization::NumberStyles | NumberStyles enum değerlerinin bit düzeyinde bir kombinasyonu; bir sayının dize temsilinin izin verilen stilini belirtir. |
| sağlayıcı | const SharedPtr\<IFormatProvider\>\& | Dize biçim bilgilerini içeren bir nesneye işaretçi. |
| result | int32_t\& | Dönüşüm sonucunun yerleştirildiği 32-bit işaretli tam sayı değişkenine referans. |

### ReturnValue

Dönüşüm başarılıysa true, aksi takdirde false.

## Ayrıca Bakınız

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Int32::TryParse(const String\&, Globalization::NumberStyles, std::nullptr_t, int32_t\&) method




```cpp
static bool System::Int32::TryParse(const String &value, Globalization::NumberStyles styles, std::nullptr_t, int32_t &result)
```

## Ayrıca Bakınız

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Int32::TryParse(const String\&, int32_t\&) method


Belirtilen sayının dize temsili içeren dizeyi eşdeğer 32-bit işaretli tam sayıya dönüştürür.

```cpp
static bool System::Int32::TryParse(const String &value, int32_t &result)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | const String\& | Dönüştürülecek dize. |
| result | int32_t\& | Dönüşüm sonucunun yerleştirildiği 32-bit işaretli tam sayı değişkenine referans. |

### ReturnValue

Dönüşüm başarılıysa true, aksi takdirde false.

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [Int32](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
