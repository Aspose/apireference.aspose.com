---
title: "System::DateTimeOffset::TryParse yöntemi"
linktitle: "TryParse"
second_title: "Aspose.Font için C++"
description: "System::DateTimeOffset::TryParse yöntemi. Belirtilen dizeyi, belirtilen biçim sağlayıcısı ve biçimlendirme stili kullanarak C++'ta DateTimeOffset nesnesine dönüştürmeye çalışır."
type: docs
weight: 5700
url: /tr/cpp/system/datetimeoffset/tryparse/
---
## DateTimeOffset::TryParse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) method


Belirtilen dizeyi, belirtilen biçim sağlayıcısı ve biçimlendirme stili kullanarak [DateTimeOffset](../) nesnesine dönüştürmeye çalışır.

```cpp
static bool System::DateTimeOffset::TryParse(const String &input, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTimeOffset &result)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| input | const String\& | [String](../../string/) dönüştürmek için. |
| sağlayıcı | const SharedPtr\<IFormatProvider\>\& | Biçim sağlayıcı. |
| styles | Globalization::DateTimeStyles | Tarih ve saat biçimlendirme stilleri. |
| result | DateTimeOffset\& | [DateTimeOffset](../) **input** ile eşdeğer olan. |

### ReturnValue

**input** başarıyla dönüştürüldüyse true, aksi takdirde false.

## Ayrıca Bakınız

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTimeOffset::TryParse(const String\&, DateTimeOffset\&) method


Belirtilen dizeyi [DateTimeOffset](../) nesnesine dönüştürmeye çalışır.

```cpp
static bool System::DateTimeOffset::TryParse(const String &input, DateTimeOffset &result)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| input | const String\& | [String](../../string/) dönüştürmek için. |
| result | DateTimeOffset\& | [DateTimeOffset](../) **input** ile eşdeğer olan. |

### ReturnValue

**input** başarıyla dönüştürüldüyse true, aksi takdirde false.

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
