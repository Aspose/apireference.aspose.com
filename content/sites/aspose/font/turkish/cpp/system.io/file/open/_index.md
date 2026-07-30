---
title: "System::IO::File::Open metodu"
linktitle: "Open"
second_title: "Aspose.Font için C++"
description: "System::IO::File::Open metodu. Belirtilen dosyayı, belirtilen modda, okuma ve yazma için ve paylaşım olmadan C++'ta açar."
type: docs
weight: 1900
url: /tr/cpp/system.io/file/open/
---
## File::Open(const String\&, FileMode) method


Belirtilen dosyayı belirtilen modda okuma ve yazma için, paylaşım olmadan açar.

```cpp
static FileStreamPtr System::IO::File::Open(const String &path, FileMode mode)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| yol | const String\& | Açılacak dosyanın yolu |
| mod | FileMode | Dosyanın açılacağı modu belirtir |

### ReturnValue

Açılan dosyayla ilişkili bir [FileStream](../../filestream/) nesnesi

## Ayrıca Bakınız

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## File::Open(const String\&, FileMode, FileAccess, FileShare) method


Belirtilen dosyayı belirtilen modda, belirtilen erişim türü ve paylaşım seçeneğiyle açar.

```cpp
static FileStreamPtr System::IO::File::Open(const String &path, FileMode mode, FileAccess access, FileShare share=FileShare::None)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| yol | const String\& | Açılacak dosyanın yolu |
| mod | FileMode | Dosyanın açılacağı modu belirtir |
| erişim | FileAccess | İstenen erişim türü |
| share | FileShare | Diğer [FileStream](../../filestream/) nesnelerinin açılan dosyaya sahip olduğu erişim türü |

### ReturnValue

Açılan dosyayla ilişkili bir [FileStream](../../filestream/) nesnesi

## Ayrıca Bakınız

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
