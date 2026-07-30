---
title: "System::DateTimeOffset::TryParseExact yöntemi"
linktitle: "TryParseExact"
second_title: "Aspose.Font için C++"
description: "System::DateTimeOffset::TryParseExact yöntemi. Belirtilen dizeyi, belirtilen biçimler, biçim sağlayıcı ve biçimlendirme stili kullanarak C++'ta DateTimeOffset nesnesine dönüştürmeye çalışır."
type: docs
weight: 5800
url: /tr/cpp/system/datetimeoffset/tryparseexact/
---
## DateTimeOffset::TryParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) method


Belirtilen dizeyi, belirtilen biçimler, biçim sağlayıcı ve biçimlendirme stili kullanarak [DateTimeOffset](../) nesnesine dönüştürmeye çalışır.

```cpp
static bool System::DateTimeOffset::TryParseExact(const String &input, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTimeOffset &result)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| input | const String\& | [String](../../string/) dönüştürmek için. |
| biçimler | const ArrayPtr\<String\>\& | Biçim dizesi dizileri. |
| sağlayıcı | const SharedPtr\<IFormatProvider\>\& | Biçim sağlayıcı. |
| styles | Globalization::DateTimeStyles | Tarih ve saat biçimlendirme stilleri. |
| result | DateTimeOffset\& | [DateTimeOffset](../) **input** ile eşdeğer olan. |

### ReturnValue

**input** başarıyla dönüştürüldüyse true, aksi takdirde false.

## Ayrıca Bakınız

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTimeOffset::TryParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) method


Belirtilen dizeyi, belirtilen biçim, biçim sağlayıcı ve biçimlendirme stili kullanarak [DateTimeOffset](../) nesnesine dönüştürmeye çalışır.

```cpp
static bool System::DateTimeOffset::TryParseExact(const String &input, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTimeOffset &result)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| input | const String\& | [String](../../string/) dönüştürmek için. |
| biçim | const String\& | Biçim dizesi. |
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
