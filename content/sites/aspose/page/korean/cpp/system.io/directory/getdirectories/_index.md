---
title: "System::IO::Directory::GetDirectories method"
linktitle: "GetDirectories"
second_title: "C++용 Aspose.Page"
description: "System::IO::Directory::GetDirectories 메서드. 지정된 디렉터리 또는 지정된 디렉터리를 루트로 하는 전체 디렉터리 트리에서 지정된 검색 기준을 만족하는 디렉터리를 C++에서 검색합니다."
type: docs
weight: 1000
url: /ko/cpp/system.io/directory/getdirectories/
---
## Directory::GetDirectories method


지정된 디렉터리 또는 해당 디렉터리를 루트로 하는 전체 디렉터리 트리에서 지정된 검색 기준을 만족하는 디렉터리를 검색합니다.

```cpp
static ArrayPtr<String> System::IO::Directory::GetDirectories(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 경로 | const String\& | 검색할 디렉터리의 전체 경로나 상대 경로 |
| searchPattern | const String\& | 검색할 디렉터리의 이름 패턴 |
| searchOption | SearchOption | 검색을 지정된 디렉터리만 수행할지, 지정된 디렉터리를 루트로 하는 전체 디렉터리 트리에서 수행할지 지정합니다. |

### ReturnValue

이름이 **searchPattern**와 일치하는 찾은 디렉터리들의 전체 경로 배열

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
