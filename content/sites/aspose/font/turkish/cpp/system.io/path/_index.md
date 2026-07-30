---
title: "System::IO::Path sınıfı"
linktitle: "Yol"
second_title: "Aspose.Font için C++"
description: "System::IO::Path sınıfı. Yolları işlemek için yöntemler sağlar. Bu, örnek hizmeti olmayan statik bir türdür. C++'ta hiçbir şekilde onun örneklerini oluşturmamalısınız."
type: docs
weight: 1900
url: /tr/cpp/system.io/path/
---
## Path class


Yolları yönetmek için yöntemler sağlar. Bu, örnek hizmeti olmayan statik bir türdür. Onun örneklerini hiçbir şekilde oluşturmamalısınız.

```cpp
class Path
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [ChangeExtension](./changeextension/)(const String\&, const String\&) | Belirtilen dosya yolundaki uzantıyı değiştirir. |
| static [CheckPath](./checkpath/)(const String\&, const String\&, bool) | Belirtilen yolun geçerli olup olmadığını, geçersiz karakterler içerip içermediğini kontrol ederek belirler. Yol geçersiz karakterler içeriyorsa bir istisna fırlatılır. |
| static [Combine](./combine/)(const ArrayPtr\<String\>\&) | Gerekirse segmentler arasına dizin ayırıcı karakterler ekleyerek belirtilen yol bölümlerini tek bir yolda birleştirir. |
| static [Combine](./combine/)(const String\&, const String\&) | Gerekirse segmentler arasına dizin ayırıcı karakter ekleyerek iki belirtilen yol bölümünü tek bir yolda birleştirir. |
| static [Combine](./combine/)(const String\&, const String\&, const String\&) | Gerekirse segmentler arasına dizin ayırıcı karakterler ekleyerek üç belirtilen yol bölümünü tek bir yolda birleştirir. |
| static [Combine](./combine/)(const String\&, const String\&, const String\&, const String\&) | Gerekirse segmentler arasına dizin ayırıcı karakterler ekleyerek dört belirtilen yol bölümünü tek bir yolda birleştirir. |
| static [GetDirectoryName](./getdirectoryname/)(const String\&) | Belirtilen yol tarafından referans edilen dizinin adını döndürür. |
| static [GetExtension](./getextension/)(const String\&) | Belirtilen yol tarafından referans edilen dosyanın uzantısını döndürür. |
| static [GetFileName](./getfilename/)(const String\&) | Belirtilen yol tarafından referans edilen dosyanın adını döndürür. |
| static [GetFileNameWithoutExtension](./getfilenamewithoutextension/)(const String\&) | Belirtilen yol tarafından referans edilen dosyanın uzantısız adını döndürür. |
| static [GetFullPath](./getfullpath/)(const String\&) | Belirtilen yolu mutlak yola dönüştürür. |
| static [GetInvalidFileNameChars](./getinvalidfilenamechars/)() | Dosya adlarında izin verilmeyen karakterleri içeren bir dizi döndürür. |
| static [GetInvalidPathChars](./getinvalidpathchars/)() | Yol adlarında izin verilmeyen karakterleri içeren bir dizi döndürür. |
| static [GetPathRoot](./getpathroot/)(const String\&) | Belirtilen yolun kök dizinini döndürür. |
| static [GetRandomFileName](./getrandomfilename/)() | Rastgele oluşturulmuş bir dosya adı döndürür. |
| static [GetTempFileName_](./gettempfilename_/)() | Benzersiz bir ada sahip yeni bir dosya oluşturur ve ona tam yolu döndürür. |
| static [GetTempFileNameSafe](./gettempfilenamesafe/)() | Benzersiz bir adla yeni bir dosya oluşturur ve ona tam bir yol döndürür. [GetTempFileName_()](./gettempfilename_/) yönteminin bir eş anlamlısıdır. |
| static [GetTempPath](./gettemppath/)() | Geçerli kullanıcının geçici dizininin yolunu döndürür. |
| static [HasExtension](./hasextension/)(const String\&) | Belirtilen yolun bir uzantıya sahip dosyaya başvurup başvurmadığını belirler. |
| static [IsPathRooted](./ispathrooted/)(const String\&) | Belirtilen yolun bir kök içerip içermediğini belirler. |
| static [NormalizePath](./normalizepath/)(const String\&) | Belirtilen yolu normalleştirir. |
| static [ToBoost](./toboost/)(const String\&) | Belirtilen yolu temsil eden boost::filesystem::path sınıfının bir örneğini döndürür. |
| static [ToString](./tostring/)(const boost::filesystem::path\&) | Belirtilen Boost yol nesnesinin dize temsilini döndürür. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [AltDirectorySeparatorChar](./altdirectoryseparatorchar/) | Yolda dizin seviyelerini ayırmak için kullanılan alternatif bir karakter. |
| static [DirectorySeparatorChar](./directoryseparatorchar/) | Yolda dizin seviyelerini ayırmak için kullanılan bir karakter. |
| static [PathSeparator](./pathseparator/) | Ortam değişkenlerindeki yol dizelerini ayırmak için kullanılan ayırıcı karakter. |
| static [VolumeSeparatorChar](./volumeseparatorchar/) | Bir birim ayırıcı karakter. |
## Açıklamalar



```cpp
#include "system/io/path.h"
#include <iostream>

int main()
{
  using namespace System::IO;

  // Rastgele bir dosya adı oluştur.
  auto filename = Path::GetRandomFileName();

  // Dosya adıyla ilgili bilgileri yazdır.
  std::cout <<
    "Filename: " << Path::GetFileName(filename) << std::endl <<
    "Filename w/o an extension: " << Path::GetFileNameWithoutExtension(filename) << std::endl <<
    "Extension: " << Path::GetExtension(filename) << std::endl;

  return 0;
}
/*
This code example produces the following output:
Filename: qhuzkyqv.y6p
Filename w/o an extension: qhuzkyqv
Extension: .y6p
*/
```

## Ayrıca Bakınız

* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
