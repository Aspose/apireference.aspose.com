---
title: "System::IO::DirectoryInfo::GetDirectories yöntemi"
linktitle: "GetDirectories"
second_title: "Aspose.Font için C++"
description: "System::IO::DirectoryInfo::GetDirectories yöntemi. C++'ta mevcut nesne tarafından temsil edilen dizinde bulunan tüm alt dizinleri temsil eden DirectoryInfo nesnelerine ortak işaretçiler içeren bir dizi döndürür."
type: docs
weight: 1200
url: /tr/cpp/system.io/directoryinfo/getdirectories/
---
## DirectoryInfo::GetDirectories() method


Geçerli nesne tarafından temsil edilen dizinde bulunan tüm dizinleri temsil eden [DirectoryInfo](../) nesnelerine ortak işaretçiler içeren bir dizi döndürür.

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories()
```

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::GetDirectories(const String\&) method


Geçerli nesne tarafından temsil edilen dizinde belirtilen arama kriterlerini karşılayan dizinleri arar.

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories(const String &searchPattern)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| searchPattern | const String\& | Aranacak dizinlerin ad deseni |

### ReturnValue

İsimleri **searchPattern** ile eşleşen bulunan dizinleri temsil eden [DirectoryInfo](../) nesnelerine ortak işaretçiler içeren bir dizi

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::GetDirectories(const String\&, SearchOption) method


Geçerli nesne tarafından temsil edilen dizinde veya bu dizinden kök alan tüm dizin ağacında belirtilen arama kriterlerini karşılayan dizinleri arar.

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories(const String &searchPattern, SearchOption searchOption)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| searchPattern | const String\& | Aranacak dizinlerin ad deseni |
| searchOption | SearchOption | Aramanın yalnızca geçerli nesne tarafından temsil edilen dizinde mi yoksa geçerli nesne tarafından temsil edilen dizinde köklenen tüm dizin ağacında mı yapılacağını belirtir |

### ReturnValue

İsimleri **searchPattern** ile eşleşen bulunan dizinleri temsil eden [DirectoryInfo](../) nesnelerine ortak işaretçiler içeren bir dizi

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
