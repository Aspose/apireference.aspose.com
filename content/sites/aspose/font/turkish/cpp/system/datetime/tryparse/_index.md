---
title: "System::DateTime::TryParse yöntemi"
linktitle: "TryParse"
second_title: "Aspose.Font için C++"
description: "C++ içinde System::DateTime sınıfının TryParse yönteminin nasıl kullanılacağını."
type: docs
weight: 6900
url: /tr/cpp/system/datetime/tryparse/
---
## DateTime::TryParse(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParse(const String &s, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles, DateTime &result)
```

## Ayrıca Bakınız

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::TryParse(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParse(const String &s, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles, DateTime &result)
```

## Ayrıca Bakınız

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::TryParse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) method


Belirtilen tarih ve saat değerinin dize temsilini, belirtilen kültüre özgü biçim bilgisi ve stilini kullanarak eşdeğer [DateTime](../) nesnesine dönüştürür.

```cpp
static bool System::DateTime::TryParse(const String &s, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTime &result)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| s | const String\& | Dönüştürülecek tarih ve saat değerinin dize temsili. |
| provider | const SharedPtr\<IFormatProvider\>\& | Kültüre özgü biçim bilgilerini sağlayan [IFormatProvider](../../iformatprovider/) nesnesi. |
| styles | Globalization::DateTimeStyles | **s** hakkında ek bilgi, **s** içinde bulunabilecek stil öğeleri hakkında bilgi veya **s**'nin bir [DateTime](../) nesnesine dönüşümü hakkında bilgi sağlayan enum değerlerinin bit düzeyinde bir birleşimi. |
| result | DateTime\& | Dönüşüm başarılı olursa dönüşüm sonucunu içeren çıktı argümanı. |

### ReturnValue

Dönüşüm başarılıysa true, aksi takdirde false.

## Ayrıca Bakınız

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::TryParse(const String\&, DateTime\&) method


Belirtilen tarih ve saat değerinin dize temsiliğini eşdeğer [DateTime](../) nesnesine dönüştürür.

```cpp
static bool System::DateTime::TryParse(const String &s, DateTime &result)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| s | const String\& | Dönüştürülecek tarih ve saat değerinin dize temsili. |
| result | DateTime\& | Dönüşüm başarılı olursa dönüşüm sonucunu içeren çıktı argümanı. |

### ReturnValue

Dönüşüm başarılıysa true, aksi takdirde false.

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::TryParse(const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) method




```cpp
static bool System::DateTime::TryParse(const String &s, std::nullptr_t, Globalization::DateTimeStyles styles, DateTime &result)
```

## Ayrıca Bakınız

* Class [String](../../string/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
