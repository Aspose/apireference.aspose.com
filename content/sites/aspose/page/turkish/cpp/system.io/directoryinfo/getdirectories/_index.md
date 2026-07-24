---
title: "System::IO::DirectoryInfo::GetDirectories yöntemi"
linktitle: "GetDirectories"
second_title: "Aspose.Page için C++"
description: "System::IO::DirectoryInfo::GetDirectories yöntemi. C++'da mevcut nesne tarafından temsil edilen dizinde bulunan tüm alt dizinleri temsil eden DirectoryInfo nesnelerine ortak işaretçiler içeren bir dizi döndürür."
type: docs
weight: 1200
url: /tr/cpp/system.io/directoryinfo/getdirectories/
---
## DirectoryInfo::GetDirectories() method


Mevcut nesne tarafından temsil edilen dizinde bulunan tüm dizinleri temsil eden [DirectoryInfo](../) nesnelerine ortak işaretçiler içeren bir dizi döndürür.

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories()
```

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetDirectories(const String\&) method


Geçerli nesne tarafından temsil edilen dizinde belirtilen arama kriterlerini karşılayan dizinleri arar.

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories(const String &searchPattern)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| searchPattern | const String\& | Aranacak dizinlerin ad kalıbı |

### ReturnValue

Adı **searchPattern** ile eşleşen bulunan dizinleri temsil eden [DirectoryInfo](../) nesnelerine ortak işaretçiler içeren bir dizi

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::GetDirectories(const String\&, SearchOption) method


Geçerli nesne tarafından temsil edilen dizinde ya da bu nesnenin temsil ettiği dizinden kök alan bütün dizin ağacında belirtilen arama kriterlerini karşılayan dizinleri arar.

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories(const String &searchPattern, SearchOption searchOption)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| searchPattern | const String\& | Aranacak dizinlerin ad kalıbı |
| searchOption | SearchOption | Aramanın yalnızca mevcut nesne tarafından temsil edilen dizinde mi yoksa mevcut nesne tarafından temsil edilen dizinde köklenen tüm dizin ağacında mı yapılacağını belirtir |

### ReturnValue

Adı **searchPattern** ile eşleşen bulunan dizinleri temsil eden [DirectoryInfo](../) nesnelerine ortak işaretçiler içeren bir dizi

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
