---
title: "System::DateTimeOffset::ParseExact yöntemi"
linktitle: "ParseExact"
second_title: "Aspose.Font için C++"
description: "System::DateTimeOffset::ParseExact yöntemi. Belirtilen dizeyi, belirtilen biçimler, biçim sağlayıcı ve biçimlendirme stili kullanarak DateTimeOffset nesnesine C++'ta dönüştürür."
type: docs
weight: 5600
url: /tr/cpp/system/datetimeoffset/parseexact/
---
## DateTimeOffset::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


Belirtilen dizeyi, belirtilen biçimler, biçim sağlayıcı ve biçimlendirme stili kullanarak [DateTimeOffset](../) nesnesine dönüştürür.

```cpp
static DateTimeOffset System::DateTimeOffset::ParseExact(const String &input, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| input | const String\& | [String](../../string/) dönüştürmek için. |
| formats | const ArrayPtr\<String\>\& | [Array](../../array/) biçim dizesi. |
| sağlayıcı | const SharedPtr\<IFormatProvider\>\& | Biçim sağlayıcı. |
| styles | Globalization::DateTimeStyles | Tarih ve saat biçimlendirme stilleri. |

### ReturnValue

[DateTimeOffset](../) that is equivalent to the **input**.

## Ayrıca Bakınız

* Class [DateTimeOffset](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTimeOffset::ParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


Belirtilen dizeyi, belirtilen biçim, biçim sağlayıcı ve biçimlendirme stili kullanarak [DateTimeOffset](../) nesnesine dönüştürür.

```cpp
static DateTimeOffset System::DateTimeOffset::ParseExact(const String &input, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| input | const String\& | [String](../../string/) dönüştürmek için. |
| biçim | const String\& | Biçim dizesi. |
| sağlayıcı | const SharedPtr\<IFormatProvider\>\& | Biçim sağlayıcı. |
| styles | Globalization::DateTimeStyles | Tarih ve saat biçimlendirme stilleri. |

### ReturnValue

[DateTimeOffset](../) that is equivalent to the **input**.

## Ayrıca Bakınız

* Class [DateTimeOffset](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
