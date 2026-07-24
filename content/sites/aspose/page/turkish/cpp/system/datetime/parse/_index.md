---
title: "System::DateTime::Parse yöntemi"
linktitle: "Parse"
second_title: "Aspose.Page için C++"
description: "System::DateTime::Parse yöntemi. Belirtilen tarih ve saat değerinin dize temsilini eşdeğer DateTime nesnesine C++ içinde dönüştürür."
type: docs
weight: 6600
url: /tr/cpp/system/datetime/parse/
---
## DateTime::Parse(const String\&) method


Belirtilen tarih ve saat değerinin dize temsilini eşdeğer [DateTime](../) nesnesine dönüştürür.

```cpp
static DateTime System::DateTime::Parse(const String &s)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| s | const String\& | Dönüştürülecek tarih ve saat değerinin dize temsili. |

### ReturnValue

Belirtilen dize tarafından temsil edilen tarih ve saat değerine eşdeğer bir değeri temsil eden yeni bir [DateTime](../) sınıfı örneği.

## Ayrıca Bakınız

* Class [DateTime](../)
* Class [String](../../string/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::Parse(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::Parse(const String &s, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## Ayrıca Bakınız

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::Parse(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::Parse(const String &s, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## Ayrıca Bakınız

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::Parse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


Belirtilen tarih ve saat değerinin dize temsilini kültüre özgü biçim bilgilerini kullanarak eşdeğer [DateTime](../) nesnesine dönüştürür.

```cpp
static DateTime System::DateTime::Parse(const String &s, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| s | const String\& | Dönüştürülecek tarih ve saat değerinin dize temsili. |
| provider | const SharedPtr\<IFormatProvider\>\& | Kültüre özgü biçim bilgilerini sağlayan [IFormatProvider](../../iformatprovider/) nesnesi. |
| styles | Globalization::DateTimeStyles | **s** hakkında ek bilgi, **s** içinde bulunabilecek stil öğeleri hakkında bilgi veya **s**'nin bir [DateTime](../) nesnesine dönüşümü hakkında bilgi sağlayan enum değerlerinin bit düzeyinde bir birleşimi. |

### ReturnValue

Belirtilen dize tarafından temsil edilen tarih ve saat değerine eşdeğer bir değeri temsil eden yeni bir [DateTime](../) sınıfı örneği.

## Ayrıca Bakınız

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::Parse(const String\&, std::nullptr_t, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::Parse(const String &s, std::nullptr_t, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## Ayrıca Bakınız

* Class [DateTime](../)
* Class [String](../../string/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
