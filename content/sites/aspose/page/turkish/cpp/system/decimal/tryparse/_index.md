---
title: "System::Decimal::TryParse yöntemi"
linktitle: "TryParse"
second_title: "Aspose.Page için C++"
description: "System::Decimal::TryParse yöntemi. Belirtilen dizeyi, bir sayının dize temsilini içeren, C++'da eşdeğer Decimal değerine dönüştürür."
type: docs
weight: 5800
url: /tr/cpp/system/decimal/tryparse/
---
## Decimal::TryParse(const String\&, Decimal\&) method


Belirtilen dizeyi, bir sayının dize temsilini içeren, eşdeğer [Decimal](../) değerine dönüştürür.

```cpp
static bool System::Decimal::TryParse(const String &value, Decimal &result)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| değer | const String\& | Dönüştürülecek dize |
| result | Decimal\& | Dönüşüm sonucunun konulduğu bir [Decimal](../) değişkenine referans |

### ReturnValue

Dönüşüm başarılıysa doğru, aksi takdirde - yanlış

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [Decimal](../)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Decimal::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, Decimal\&) method


Belirtilen dizeyi, bir sayının dize temsilini içeren, sağlanan biçimlendirme bilgileri ve sayı stili kullanılarak eşdeğer [Decimal](../) değerine dönüştürür.

```cpp
static bool System::Decimal::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, Decimal &result)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| değer | const String\& | Dönüştürülecek dize |
| styles | Globalization::NumberStyles | Bir sayının dize temsilinin izin verilen stilini belirten NumberStyles enum değerlerinin bit düzeyinde bir kombinasyonu |
| sağlayıcı | const SharedPtr\<IFormatProvider\>\& | Dize format bilgilerini içeren bir nesneye işaretçi |
| sonuç | Decimal\& | Bir çıktı argümanı; dönüşüm sonucunu içerir |

### ReturnValue

Dönüşüm başarılıysa doğru, aksi takdirde - yanlış

## Ayrıca Bakınız

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Decimal](../)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
