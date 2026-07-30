---
title: "System::Decimal::TryParse metodu"
linktitle: "TryParse"
second_title: "Aspose.Font için C++"
description: "System::Decimal::TryParse metodu. Belirtilen dizeyi, bir sayının dize temsilini içeren, C++'ta eşdeğer Decimal değerine dönüştürür."
type: docs
weight: 5800
url: /tr/cpp/system/decimal/tryparse/
---
## Decimal::TryParse(const String\&, Decimal\&) method


Belirtilen dizeyi, bir sayının dize temsilini içeren, eşdeğer bir [Decimal](../) değerine dönüştürür.

```cpp
static bool System::Decimal::TryParse(const String &value, Decimal &result)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | const String\& | Dönüştürülecek dize |
| result | Decimal\& | Dönüşüm sonucunun yerleştirileceği bir [Decimal](../) değişkenine referans |

### ReturnValue

Doğru ise dönüşüm başarılıdır, aksi takdirde - yanlış

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [Decimal](../)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Decimal::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, Decimal\&) method


Belirtilen dizeyi, bir sayının dize temsilini içeren, sağlanan biçimlendirme bilgileri ve sayı stili kullanılarak eşdeğer bir [Decimal](../) değerine dönüştürür.

```cpp
static bool System::Decimal::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, Decimal &result)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | const String\& | Dönüştürülecek dize |
| styles | Globalization::NumberStyles | Bir sayının dize temsili için izin verilen stili belirten NumberStyles enum değerlerinin bit düzeyinde bir kombinasyonu |
| sağlayıcı | const SharedPtr\<IFormatProvider\>\& | Dize biçim bilgilerini içeren bir nesneye işaretçi |
| result | Decimal\& | Bir çıktı argümanı; dönüşüm sonucunu içerir |

### ReturnValue

Doğru ise dönüşüm başarılıdır, aksi takdirde - yanlış

## Ayrıca Bakınız

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Decimal](../)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
