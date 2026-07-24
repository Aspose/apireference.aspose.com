---
title: "System::IO::Path::CheckPath 메서드"
linktitle: "CheckPath"
second_title: "C++용 Aspose.Page"
description: "System::IO::Path::CheckPath 메서드. 지정된 경로에 잘못된 문자가 포함되어 있는지 확인하여 경로가 유효한지 판단합니다. C++에서 경로에 잘못된 문자가 포함되어 있으면 예외가 발생합니다."
type: docs
weight: 200
url: /ko/cpp/system.io/path/checkpath/
---
## Path::CheckPath method


지정된 경로에 잘못된 문자가 포함되어 있는지 확인하여 경로가 유효한지 판단합니다. 경로에 잘못된 문자가 포함되어 있으면 예외가 발생합니다.

```cpp
static void System::IO::Path::CheckPath(const String &path, const String &msg=s_msg_path, bool allow_empty=true)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 경로 | const String\& | 확인할 경로 |
| msg | const String\& | 예외 객체의 생성자에 전달할 메시지 |
| allow_empty | bool | 빈 문자열 또는 null 문자열을 올바른 경로로 간주할지 여부를 지정합니다 (true이면 간주, false이면 간주하지 않음). 이 매개변수가 false이고 **path**가 비어 있으면 ArgumentException이 발생하고, 이 매개변수가 false이고 **path**가 null이면 ArgumentNullException이 발생합니다. |

## 또 보기

* Class [String](../../../system/string/)
* Class [Path](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
