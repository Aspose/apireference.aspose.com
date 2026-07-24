---
title: "System::IO::Directory 클래스"
linktitle: "Directory"
second_title: "C++용 Aspose.Page"
description: "System::IO::Directory 클래스. 디렉터리를 조작하는 메서드를 포함합니다. 이는 인스턴스 서비스를 제공하지 않는 정적 타입입니다. C++에서 어떤 방법으로도 인스턴스를 생성해서는 안 됩니다."
type: docs
weight: 1100
url: /ko/cpp/system.io/directory/
---
## Directory class


디렉터리를 조작하는 메서드를 포함합니다. 이는 인스턴스 서비스를 제공하지 않는 정적 타입입니다. 어떠한 방법으로도 인스턴스를 생성해서는 안 됩니다.

```cpp
class Directory
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [CreateDirectory_](./createdirectory_/)(const String\&) | 지정된 경로에 존재하지 않는 경우 모든 디렉터리를 생성합니다. |
| static [Delete](./delete/)(const String\&, bool) | 지정된 파일 또는 디렉터리를 제거합니다. 예외를 발생시키지 않습니다. |
| static [EnumerateDirectories](./enumeratedirectories/)(const String\&, const String\&, SearchOption) | 지정된 디렉터리 또는 해당 디렉터리를 루트로 하는 전체 디렉터리 트리에서 지정된 검색 기준을 만족하는 디렉터리를 검색합니다. |
| static [EnumerateFiles](./enumeratefiles/)(const String\&, const String\&, SearchOption) | 지정된 디렉터리 또는 해당 디렉터리를 루트로 하는 전체 디렉터리 트리에서 지정된 검색 기준을 만족하는 파일을 검색합니다. |
| static [EnumerateFileSystemEntries](./enumeratefilesystementries/)(const String\&, const String\&, SearchOption) | 지정된 디렉터리 또는 해당 디렉터리를 루트로 하는 전체 디렉터리 트리에서 지정된 검색 기준을 만족하는 파일 및 디렉터리를 검색합니다. |
| static [Exists](./exists/)(const String\&) | 지정된 경로가 기존 디렉터리를 가리키는지 확인합니다. |
| static [GetCreationTime](./getcreationtime/)(const String\&) | 지정된 엔터티의 생성 시간을 로컬 시간으로 반환합니다. |
| static [GetCreationTimeUtc](./getcreationtimeutc/)(const String\&) | 지정된 엔터티의 생성 시간을 UTC 시간으로 반환합니다. |
| static [GetCurrentDirectory](./getcurrentdirectory/)() | 현재 디렉터리의 전체 이름(경로 포함)을 반환합니다. |
| static [GetDirectories](./getdirectories/)(const String\&, const String\&, SearchOption) | 지정된 디렉터리 또는 해당 디렉터리를 루트로 하는 전체 디렉터리 트리에서 지정된 검색 기준을 만족하는 디렉터리를 검색합니다. |
| static [GetDirectoryRoot](./getdirectoryroot/)(const String\&) | 지정된 경로의 루트 디렉터리를 반환합니다. |
| static [GetFiles](./getfiles/)(const String\&, const String\&, SearchOption) | 지정된 디렉터리 또는 해당 디렉터리를 루트로 하는 전체 디렉터리 트리에서 지정된 검색 기준을 만족하는 파일을 검색합니다. |
| static [GetFileSystemEntries](./getfilesystementries/)(const String\&, const String\&, SearchOption) | 지정된 디렉터리 또는 해당 디렉터리를 루트로 하는 전체 디렉터리 트리에서 지정된 검색 기준을 만족하는 파일 및 디렉터리를 검색합니다. |
| static [GetLastAccessTime](./getlastaccesstime/)(const String\&) | 지정된 엔터티의 마지막 액세스 시간을 로컬 시간으로 반환합니다. |
| static [GetLastAccessTimeUtc](./getlastaccesstimeutc/)(const String\&) | 지정된 엔터티의 마지막 액세스 시간을 UTC 시간으로 반환합니다. |
| static [GetLastWriteTime](./getlastwritetime/)(const String\&) | 지정된 엔터티의 마지막 쓰기 시간을 로컬 시간으로 반환합니다. |
| static [GetLastWriteTimeUtc](./getlastwritetimeutc/)(const String\&) | 지정된 엔터티의 마지막 쓰기 시간을 UTC 시간으로 반환합니다. |
| static [GetLogicalDrives](./getlogicaldrives/)() | 구현되지 않음. |
| static [GetParent](./getparent/)(const String\&) | 지정된 엔터티의 상위 디렉터리를 나타내는 [DirectoryInfo](../directoryinfo/) 객체에 대한 공유 포인터를 반환합니다. |
| static [Move](./move/)(const String\&, const String\&) | 지정된 엔터티를 새 위치로 이동합니다. 이동할 엔터티가 디렉터리인 경우, 해당 디렉터리와 모든 내용이 함께 이동됩니다. |
| static [SetCreationTime](./setcreationtime/)(const String\&, DateTime) | 지정된 엔터티의 생성 시간을 로컬 시간으로 설정합니다. |
| static [SetCreationTimeUtc](./setcreationtimeutc/)(const String\&, DateTime) | 지정된 엔터티의 생성 시간을 UTC 시간으로 설정합니다. |
| static [SetCurrentDirectory](./setcurrentdirectory/)(const String\&) | 현재 디렉터리를 설정합니다. |
| static [SetLastAccessTime](./setlastaccesstime/)(const String\&, DateTime) | 지정된 엔터티의 마지막 접근 시간을 로컬 시간으로 설정합니다. |
| static [SetLastAccessTimeUtc](./setlastaccesstimeutc/)(const String\&, DateTime) | 지정된 엔터티의 마지막 접근 시간을 UTC 시간으로 설정합니다. |
| static [SetLastWriteTime](./setlastwritetime/)(const String\&, DateTime) | 지정된 엔터티의 마지막 쓰기 시간을 로컬 시간으로 설정합니다. |
| static [SetLastWriteTimeUtc](./setlastwritetimeutc/)(const String\&, DateTime) | 지정된 엔터티의 마지막 쓰기 시간을 UTC 시간으로 설정합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [StringEnumerablePtr](./stringenumerableptr/) | IEnumerable 객체에 대한 공유 포인터 별칭이며, [String](../../system/string/) 객체 집합을 열거합니다. |
## 비고



```cpp
#include "system/io/directory.h"
#include "system/io/path.h"
#include "system/string.h"
#include <iostream>

void PrintMessage(const System::String &path)
{
  std::cout << "Directory '" << path << (System::IO::Directory::Exists(path) ? "' exists." : "' doesn't exist.") << std::endl;
}

int main()
{
  // 디렉터리 경로를 포함하는 문자열을 생성합니다.
  System::String discPath(u"C:\\");
  System::String directoryPath(u"C:\\Some directory");
  auto tempPath = System::IO::Path::GetTempPath();

  // 디렉터리가 존재하는지 확인합니다.
  PrintMessage(discPath);
  PrintMessage(directoryPath);
  PrintMessage(tempPath);

  // 임시 디렉터리 정보를 출력합니다.
  std::cout <<
    "Creation Time: " << System::IO::Directory::GetCreationTime(tempPath) << std::endl <<
    "Last Access Time: " << System::IO::Directory::GetLastAccessTime(tempPath) << std::endl <<
    "Last Write Time: " << System::IO::Directory::GetLastWriteTime(tempPath) << std::endl;

  return 0;
}
/*
This code example produces the following output:
Directory 'C:\' exists.
Directory 'C:\Some directory' doesn't exist.
Directory 'C:\Users\lanor\AppData\Local\Temp\' exists.
Creation Time: 27.08.2021 14:21:42
Last Access Time: 07.10.2021 12:16:41
Last Write Time: 07.10.2021 12:16:41
*/
```

## 또 보기

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
