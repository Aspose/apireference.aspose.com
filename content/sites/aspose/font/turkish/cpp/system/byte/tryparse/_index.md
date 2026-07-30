---
title: "System::Byte::TryParse yöntemi"
linktitle: "TryParse"
second_title: "Aspose.Font için C++"
description: "System::Byte sınıfının TryParse yönteminin C++'ta nasıl kullanılacağı."
type: docs
weight: 200
url: /tr/cpp/system/byte/tryparse/
---
## Byte::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, uint8_t\&) method




```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture, uint8_t &result)
```

## Ayrıca Bakınız

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Byte::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, uint8_t\&) method




```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi, uint8_t &result)
```

## Ayrıca Bakınız

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Byte::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, uint8_t\&) method


Belirtilen sayının dize temsilini içeren dizgeyi, sağlanan biçimlendirme bilgileri ve sayı stili kullanılarak eşdeğer 8-bit işaretsiz tam sayıya dönüştürür.

```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, uint8_t &result)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | const String\& | Dönüştürülecek dize. |
| styles | Globalization::NumberStyles | NumberStyles enum değerlerinin bit düzeyinde bir kombinasyonu; bir sayının dize temsilinin izin verilen stilini belirtir. |
| sağlayıcı | const SharedPtr\<IFormatProvider\>\& | Dize biçim bilgilerini içeren bir nesneye işaretçi. |
| result | uint8_t\& | Dönüşüm sonucunun konulduğu 8-bit işaretsiz tamsayı değişkenine referans. |

### ReturnValue

Dönüşüm başarılıysa true, aksi takdirde false.

## Ayrıca Bakınız

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Byte::TryParse(const String\&, Globalization::NumberStyles, std::nullptr_t, uint8_t\&) method




```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, std::nullptr_t, uint8_t &result)
```

## Ayrıca Bakınız

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Byte::TryParse(const String\&, uint8_t\&) method


Belirtilen sayının dize temsilini içeren dizgeyi eşdeğer 8-bit işaretsiz tam sayıya dönüştürür.

```cpp
static bool System::Byte::TryParse(const String &value, uint8_t &result)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | const String\& | Dönüştürülecek dize. |
| result | uint8_t\& | Dönüşüm sonucunun konulduğu 8-bit işaretsiz tamsayı değişkenine referans. |

### ReturnValue

Dönüşüm başarılıysa true, aksi takdirde false.

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
