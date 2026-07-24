---
title: "System::IO::Directory::EnumerateFileSystemEntries 메서드"
linktitle: "EnumerateFileSystemEntries"
second_title: "C++용 Aspose.Page"
description: "System::IO::Directory::EnumerateFileSystemEntries 메서드. 지정된 디렉터리 또는 지정된 디렉터리를 루트로 하는 전체 디렉터리 트리에서 지정된 검색 기준을 만족하는 파일 및 디렉터리를 검색합니다 (C++)."
type: docs
weight: 500
url: /ko/cpp/system.io/directory/enumeratefilesystementries/
---
## Directory::EnumerateFileSystemEntries method


지정된 디렉터리 또는 해당 디렉터리를 루트로 하는 전체 디렉터리 트리에서 지정된 검색 기준을 만족하는 파일 및 디렉터리를 검색합니다.

```cpp
static StringEnumerablePtr System::IO::Directory::EnumerateFileSystemEntries(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 경로 | const String\& | 검색할 디렉터리의 전체 경로나 상대 경로 |
| searchPattern | const String\& | 검색할 파일 및 디렉터리의 이름 패턴 |
| searchOption | SearchOption | 검색을 지정된 디렉터리만 수행할지, 지정된 디렉터리를 루트로 하는 전체 디렉터리 트리에서 수행할지 지정합니다. |

### ReturnValue

검색 패턴 **searchPattern**와 일치하는 찾은 파일 및 디렉터리의 전체 경로를 포함하는 열거 가능한 컬렉션

## 또 보기

* Typedef [StringEnumerablePtr](../stringenumerableptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
