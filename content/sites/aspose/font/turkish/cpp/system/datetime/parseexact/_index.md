---
title: "System::DateTime::ParseExact metodu"
linktitle: "ParseExact"
second_title: "Aspose.Font için C++"
description: "C++ içinde System::DateTime sınıfının ParseExact metodunun nasıl kullanılacağını."
type: docs
weight: 6700
url: /tr/cpp/system/datetime/parseexact/
---
## DateTime::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles)
```

## Ayrıca Bakınız

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles)
```

## Ayrıca Bakınız

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


Belirtilen tarih ve saat değerinin dize temsili, belirtilen biçimler, kültüre özgü biçim bilgileri ve stil kullanılarak eşdeğer [DateTime](../) nesnesine dönüştürülür. Dize temsili biçimi, belirtilen biçimlerden bir veya daha fazlasıyla tam olarak eşleşmelidir. Dönüştürme başarısız olursa bir istisna fırlatılır.

```cpp
static DateTime System::DateTime::ParseExact(const String &s, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| s | const String\& | Dönüştürülecek tarih ve saat değerinin dize temsili. |
| biçimler | const ArrayPtr\<String\>\& | Dize biçimlerinin dizisi. |
| provider | const SharedPtr\<IFormatProvider\>\& | Kültüre özgü biçim bilgilerini sağlayan [IFormatProvider](../../iformatprovider/) nesnesi. |
| styles | Globalization::DateTimeStyles | **s** hakkında ek bilgi, **s** içinde bulunabilecek stil öğeleri hakkında bilgi veya **s**'nin bir [DateTime](../) nesnesine dönüşümü hakkında bilgi sağlayan enum değerlerinin bit düzeyinde bir birleşimi. |

### ReturnValue

Belirtilen dize tarafından temsil edilen tarih ve saat değerine eşdeğer bir [DateTime](../) sınıfının yeni bir örneği.

## Ayrıca Bakınız

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::ParseExact(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const ArrayPtr<String> &formats, std::nullptr_t, Globalization::DateTimeStyles styles)
```

## Ayrıca Bakınız

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::ParseExact(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const String &format, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## Ayrıca Bakınız

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::ParseExact(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const String &format, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## Ayrıca Bakınız

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::ParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


Belirtilen tarih ve saat değerinin dize temsili, belirtilen format ve kültüre özgü biçim bilgileri kullanılarak eşdeğer [DateTime](../) nesnesine dönüştürülür. Dize temsili biçimi, belirtilen formatla tam olarak eşleşmelidir. Dönüştürme başarısız olursa bir istisna fırlatılır.

```cpp
static DateTime System::DateTime::ParseExact(const String &s, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| s | const String\& | Dönüştürülecek tarih ve saat değerinin dize temsili. |
| biçim | const String\& | Dize biçimi. |
| provider | const SharedPtr\<IFormatProvider\>\& | Kültüre özgü biçim bilgilerini sağlayan [IFormatProvider](../../iformatprovider/) nesnesi. |
| styles | Globalization::DateTimeStyles | **s** hakkında ek bilgi, **s** içinde bulunabilecek stil öğeleri hakkında bilgi veya **s**'nin bir [DateTime](../) nesnesine dönüşümü hakkında bilgi sağlayan enum değerlerinin bit düzeyinde bir birleşimi. |

### ReturnValue

Belirtilen dize tarafından temsil edilen tarih ve saat değerine eşdeğer bir [DateTime](../) sınıfının yeni bir örneği.

## Ayrıca Bakınız

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTime::ParseExact(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::ParseExact(const String &s, const String &format, std::nullptr_t, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## Ayrıca Bakınız

* Class [DateTime](../)
* Class [String](../../string/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
