---
title: "System::IO::DirectoryInfo::GetFiles yöntemi"
linktitle: "GetFiles"
second_title: "Aspose.Page için C++"
description: "System::IO::DirectoryInfo::GetFiles yöntemi. Geçerli nesne tarafından temsil edilen dizinde bulunan tüm dizinleri temsil eden FileInfo nesnelerine ortak işaretçiler içeren bir dizi döndürür C++'ta."
type: docs
weight: 1300
url: /tr/cpp/system.io/directoryinfo/getfiles/
---
## DirectoryInfo::GetFiles() method


Geçerli nesne tarafından temsil edilen dizinde bulunan tüm dizinleri temsil eden [FileInfo](../../fileinfo/) nesnelerine ortak işaretçiler içeren bir dizi döndürür.

```cpp
ArrayPtr<FileInfoPtr> System::IO::DirectoryInfo::GetFiles()
```

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetFiles(const String\&) method


Geçerli nesne tarafından temsil edilen dizinde belirtilen arama kriterlerini karşılayan dosyaları arar.

```cpp
ArrayPtr<FileInfoPtr> System::IO::DirectoryInfo::GetFiles(const String &searchPattern)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| searchPattern | const String\& | Aranacak dosyaların ad kalıbı |

### ReturnValue

Bulunan dosyaların adları **searchPattern** ile eşleşen [FileInfo](../../fileinfo/) nesnelerine ortak işaretçiler içeren bir dizi.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetFiles(const String\&, SearchOption) method


Geçerli nesne tarafından temsil edilen dizinde veya bu dizinden kök alan tüm dizin ağacında belirtilen arama kriterlerini karşılayan dosyaları arar.

```cpp
ArrayPtr<FileInfoPtr> System::IO::DirectoryInfo::GetFiles(const String &searchPattern, SearchOption searchOption)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| searchPattern | const String\& | Aranacak dosyaların ad kalıbı |
| searchOption | SearchOption | Aramanın yalnızca mevcut nesne tarafından temsil edilen dizinde mi yoksa mevcut nesne tarafından temsil edilen dizinde köklenen tüm dizin ağacında mı yapılacağını belirtir |

### ReturnValue

Bulunan dosyaların adları **searchPattern** ile eşleşen [FileInfo](../../fileinfo/) nesnelerine ortak işaretçiler içeren bir dizi.

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
