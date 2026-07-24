---
title: "System::IO::DirectoryInfo::EnumerateDirectories yöntemi"
linktitle: "EnumerateDirectories"
second_title: "Aspose.Page için C++"
description: "System::IO::DirectoryInfo::EnumerateDirectories yöntemi. Geçerli nesne tarafından temsil edilen dizinde bulunan tüm dizinleri içeren yinelenebilir bir koleksiyon döndürür C++'ta."
type: docs
weight: 500
url: /tr/cpp/system.io/directoryinfo/enumeratedirectories/
---
## DirectoryInfo::EnumerateDirectories() method


Geçerli nesne tarafından temsil edilen dizinde bulunan tüm alt dizinleri içeren yinelemeli bir koleksiyon döndürür.

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories()
```

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateDirectories(const String\&) method


Geçerli nesne tarafından temsil edilen dizinde belirtilen arama kriterlerini karşılayan dizinleri arar.

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories(const String &searchPattern)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| searchPattern | const String\& | Aranacak dizinlerin ad kalıbı |

### ReturnValue

Bulunan dizinlerin adları **searchPattern** ile eşleşen [DirectoryInfo](../) nesnelerine ortak işaretçiler içeren yinelenebilir koleksiyon.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateDirectories(const String\&, SearchOption) method


Geçerli nesne tarafından temsil edilen dizinde ya da bu nesnenin temsil ettiği dizinden kök alan bütün dizin ağacında belirtilen arama kriterlerini karşılayan dizinleri arar.

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories(const String &searchPattern, SearchOption searchOption)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| searchPattern | const String\& | Aranacak dizinlerin ad kalıbı |
| searchOption | SearchOption | Aramanın yalnızca mevcut nesne tarafından temsil edilen dizinde mi yoksa mevcut nesne tarafından temsil edilen dizinde köklenen tüm dizin ağacında mı yapılacağını belirtir |

### ReturnValue

Bulunan dizinlerin adları **searchPattern** ile eşleşen [DirectoryInfo](../) nesnelerine ortak işaretçiler içeren yinelenebilir koleksiyon.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
