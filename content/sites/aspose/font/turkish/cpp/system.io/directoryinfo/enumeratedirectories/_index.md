---
title: "System::IO::DirectoryInfo::EnumerateDirectories yöntemi"
linktitle: "EnumerateDirectories"
second_title: "Aspose.Font için C++"
description: "System::IO::DirectoryInfo::EnumerateDirectories yöntemi. Geçerli nesne tarafından temsil edilen dizinde bulunan tüm dizinleri içeren yinelenebilir bir koleksiyon döndürür C++ içinde."
type: docs
weight: 500
url: /tr/cpp/system.io/directoryinfo/enumeratedirectories/
---
## DirectoryInfo::EnumerateDirectories() method


Geçerli nesne tarafından temsil edilen dizinde bulunan tüm dizinleri içeren yinelemeli bir koleksiyon döndürür.

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories()
```

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::EnumerateDirectories(const String\&) method


Geçerli nesne tarafından temsil edilen dizinde belirtilen arama kriterlerini karşılayan dizinleri arar.

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories(const String &searchPattern)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| searchPattern | const String\& | Aranacak dizinlerin ad deseni |

### ReturnValue

Bulunan ve adları **searchPattern** ile eşleşen dizinleri temsil eden [DirectoryInfo](../) nesnelerine ortak işaretçilerin bulunduğu yinelenebilir koleksiyon

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::EnumerateDirectories(const String\&, SearchOption) method


Geçerli nesne tarafından temsil edilen dizinde veya bu dizinden kök alan tüm dizin ağacında belirtilen arama kriterlerini karşılayan dizinleri arar.

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories(const String &searchPattern, SearchOption searchOption)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| searchPattern | const String\& | Aranacak dizinlerin ad deseni |
| searchOption | SearchOption | Aramanın yalnızca geçerli nesne tarafından temsil edilen dizinde mi yoksa geçerli nesne tarafından temsil edilen dizinde köklenen tüm dizin ağacında mı yapılacağını belirtir |

### ReturnValue

Bulunan ve adları **searchPattern** ile eşleşen dizinleri temsil eden [DirectoryInfo](../) nesnelerine ortak işaretçilerin bulunduğu yinelenebilir koleksiyon

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
