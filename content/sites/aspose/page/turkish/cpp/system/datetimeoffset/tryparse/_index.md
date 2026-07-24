---
title: "System::DateTimeOffset::TryParse yöntemi"
linktitle: "TryParse"
second_title: "Aspose.Page için C++"
description: "System::DateTimeOffset::TryParse yöntemi. Belirtilen dizeyi, belirtilen format sağlayıcısı ve biçimlendirme stili kullanarak C++'ta DateTimeOffset nesnesine dönüştürmeyi dener."
type: docs
weight: 5700
url: /tr/cpp/system/datetimeoffset/tryparse/
---
## DateTimeOffset::TryParse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) method


Belirtilen dizeyi, belirtilen format sağlayıcısı ve biçimlendirme stili kullanarak [DateTimeOffset](../) nesnesine dönüştürmeyi dener.

```cpp
static bool System::DateTimeOffset::TryParse(const String &input, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTimeOffset &result)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| input | const String\& | [String](../../string/) dönüştürmek için. |
| sağlayıcı | const SharedPtr\<IFormatProvider\>\& | Biçim sağlayıcı. |
| styles | Globalization::DateTimeStyles | Tarih ve saat biçimlendirme stilleri. |
| result | DateTimeOffset\& | [DateTimeOffset](../) **input** ile eşdeğerdir. |

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
* Library [Aspose.Page for C++](../../../)
## DateTimeOffset::TryParse(const String\&, DateTimeOffset\&) method


Belirtilen dizeyi [DateTimeOffset](../) nesnesine dönüştürmeyi dener.

```cpp
static bool System::DateTimeOffset::TryParse(const String &input, DateTimeOffset &result)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| input | const String\& | [String](../../string/) dönüştürmek için. |
| result | DateTimeOffset\& | [DateTimeOffset](../) **input** ile eşdeğerdir. |

### ReturnValue

**input** başarıyla dönüştürüldüyse true, aksi takdirde false.

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
