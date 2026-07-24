---
title: "System::IO::DirectoryInfo::EnumerateDirectories 메서드"
linktitle: "EnumerateDirectories"
second_title: "C++용 Aspose.Page"
description: "System::IO::DirectoryInfo::EnumerateDirectories 메서드. 현재 객체가 나타내는 디렉터리 내에 위치한 모든 디렉터리를 포함하는 열거 가능한 컬렉션을 반환합니다 (C++)."
type: docs
weight: 500
url: /ko/cpp/system.io/directoryinfo/enumeratedirectories/
---
## DirectoryInfo::EnumerateDirectories() method


현재 객체가 나타내는 디렉터리 내에 위치한 모든 디렉터리를 포함하는 열거 가능한 컬렉션을 반환합니다.

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories()
```

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateDirectories(const String\&) method


현재 객체가 나타내는 디렉터리에서 지정된 검색 기준을 만족하는 디렉터리를 검색합니다.

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories(const String &searchPattern)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| searchPattern | const String\& | 검색할 디렉터리의 이름 패턴 |

### ReturnValue

이름이 **searchPattern**와 일치하는 찾은 디렉터리를 나타내는 [DirectoryInfo](../) 객체에 대한 공유 포인터의 열거 가능한 컬렉션

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## DirectoryInfo::EnumerateDirectories(const String\&, SearchOption) method


현재 객체가 나타내는 디렉터리 또는 해당 디렉터리를 루트로 하는 전체 디렉터리 트리에서 지정된 검색 기준을 만족하는 디렉터리를 검색합니다.

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories(const String &searchPattern, SearchOption searchOption)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| searchPattern | const String\& | 검색할 디렉터리의 이름 패턴 |
| searchOption | SearchOption | 검색을 현재 객체가 나타내는 디렉터리에서만 수행할지, 아니면 해당 디렉터리를 루트로 하는 전체 디렉터리 트리에서 수행할지를 지정합니다. |

### ReturnValue

이름이 **searchPattern**와 일치하는 찾은 디렉터리를 나타내는 [DirectoryInfo](../) 객체에 대한 공유 포인터의 열거 가능한 컬렉션

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
