---
title: "System::IO::File::WriteAllLines method"
linktitle: "WriteAllLines"
second_title: "Aspose.Font için C++"
description: "System::IO::File::WriteAllLines yöntemi. Yeni bir metin dosyası oluşturur veya mevcut dosyanın üzerine yazar ve belirtilen dizi içindeki tüm dizeleri, her birini yeni bir satıra yazarak, belirtilen kodlamayı kullanarak C++'ta dosyaya yazar."
type: docs
weight: 3600
url: /tr/cpp/system.io/file/writealllines/
---
## File::WriteAllLines(const String\&, const ArrayPtr\<String\>\&, const EncodingPtr\&) method


Yeni bir metin dosyası oluşturur veya mevcut olanın üzerine yazar ve belirtilen kodlamayı kullanarak, belirtilen dize dizisindeki tüm dizeleri dosyaya yazar; her dize yeni bir satıra konur.

```cpp
static void System::IO::File::WriteAllLines(const String &path, const ArrayPtr<String> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| yol | const String\& | Oluşturulacak veya üzerine yazılacak dosya |
| içerikler | const ArrayPtr\<String\>\& | Bir dize dizisi |
| encoding | const EncodingPtr\& | Kullanılacak karakter kodlaması |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## File::WriteAllLines(const String\&, const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&, const EncodingPtr\&) method


Yeni bir metin dosyası oluşturur veya mevcut olanın üzerine yazar ve belirtilen kodlamayı kullanarak, belirtilen dizilebilir dize koleksiyonundaki tüm dizeleri dosyaya yazar; her dize yeni bir satıra konur.

```cpp
static void System::IO::File::WriteAllLines(const String &path, const SharedPtr<Collections::Generic::IEnumerable<String>> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| yol | const String\& | Oluşturulacak veya üzerine yazılacak dosya |
| içerikler | const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\& | Dizelerden oluşan bir yinelemeli koleksiyon |
| encoding | const EncodingPtr\& | Kullanılacak karakter kodlaması |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
