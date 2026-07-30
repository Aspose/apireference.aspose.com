---
title: "System::Version sınıfı"
linktitle: "Sürüm"
second_title: "Aspose.Font için C++"
description: "System::Version sınıfı. Bir sürüm numarasını temsil eder. Bu tip yığıt (stack) üzerinde ayrılmalı ve fonksiyonlara değer olarak ya da referansla geçirilmelidir. C++'da bu tipin nesnelerini yönetmek için System::SmartPtr sınıfını asla kullanmayın."
type: docs
weight: 7300
url: /tr/cpp/system/version/
---
## Version class


Bir sürüm numarasını temsil eder. Bu tip yığıt üzerinde ayrılmalı ve fonksiyonlara değer olarak ya da referansla geçirilmelidir. Bu tipin nesnelerini yönetmek için [System::SmartPtr](../smartptr/) sınıfını asla kullanmayın.

```cpp
class Version
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CompareTo](./compareto/)(const Version\&) const | Geçerli nesne ve belirtilen nesne tarafından temsil edilen sürümleri karşılaştırır. |
| [Equals](./equals/)(const Version\&) const | Geçerli ve belirtilen nesneler tarafından temsil edilen sürüm numaralarının eşit olup olmadığını belirler. |
| [get_Build](./get_build/)() const | Derleme numarasını döndürür. |
| [get_Major](./get_major/)() const | Ana sürümü döndürür. |
| [get_MajorRevision](./get_majorrevision/)() const | Revizyon numarasının yüksek 16-bit değerini döndürür. |
| [get_Minor](./get_minor/)() const | Alt sürümü döndürür. |
| [get_MinorRevision](./get_minorrevision/)() const | Revizyon numarasının düşük 16-bit değerini döndürür. |
| [get_Revision](./get_revision/)() const | Revizyon numarasını döndürür. |
| [GetHashCode](./gethashcode/)() const | Mevcut nesne için bir karma kodu döndürür. |
| static [Parse](./parse/)(const String\&) | Bir sürüm numarasının dize temsilini eşdeğer bir [Version](./) sınıfı örneğine dönüştürür. |
| [ToString](./tostring/)() const | Geçerli nesne tarafından temsil edilen sürüm numarasının dize temsilini döndürür. |
| [ToString](./tostring/)(int) const | Geçerli nesne tarafından temsil edilen sürüm numarasının belirtilen bölüm sayısının dize temsilini döndürür. |
| [Version](./version/)(int, int, int, int) | Belirtilen ana, alt, derleme ve revizyon değerlerini temsil eden bir örnek oluşturur. |
| [Version](./version/)(int, int, int) | Belirtilen ana, alt ve derleme değerlerini temsil eden bir örnek oluşturur. |
| [Version](./version/)(int, int) | Belirtilen ana ve değerleri temsil eden bir örnek oluşturur. |
| [Version](./version/)(const String\&) | Dize olarak temsil edilen sürüm numarasını temsil eden bir örnek oluşturur. |
| [Version](./version/)() | 0.0.-1.-1 sürüm numarasını temsil eden bir örnek oluşturur. |
## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
