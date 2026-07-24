---
title: "System::IO::Path 클래스"
linktitle: "Path"
second_title: "C++용 Aspose.Page"
description: "System::IO::Path 클래스. 경로를 조작하는 메서드를 제공합니다. 이는 인스턴스 서비스를 갖지 않는 정적 타입이며, C++에서 어떠한 방법으로도 인스턴스를 생성해서는 안 됩니다."
type: docs
weight: 1900
url: /ko/cpp/system.io/path/
---
## Path class


경로를 조작하기 위한 메서드를 제공합니다. 이는 인스턴스 서비스를 갖지 않는 정적 타입입니다. 어떤 방법으로도 인스턴스를 생성해서는 안 됩니다.

```cpp
class Path
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [ChangeExtension](./changeextension/)(const String\&, const String\&) | 지정된 파일 경로의 확장자를 변경합니다. |
| static [CheckPath](./checkpath/)(const String\&, const String\&, bool) | 지정된 경로에 잘못된 문자가 포함되어 있는지 확인하여 경로가 유효한지 판단합니다. 경로에 잘못된 문자가 포함되어 있으면 예외가 발생합니다. |
| static [Combine](./combine/)(const ArrayPtr\<String\>\&) | 필요에 따라 세그먼트 사이에 디렉터리 구분자를 삽입하여 지정된 경로 세그먼트를 하나의 경로로 결합합니다. |
| static [Combine](./combine/)(const String\&, const String\&) | 필요에 따라 두 개의 지정된 경로 세그먼트 사이에 디렉터리 구분자를 삽입하여 하나의 경로로 결합합니다. |
| static [Combine](./combine/)(const String\&, const String\&, const String\&) | 필요에 따라 세 개의 지정된 경로 세그먼트 사이에 디렉터리 구분자를 삽입하여 하나의 경로로 결합합니다. |
| static [Combine](./combine/)(const String\&, const String\&, const String\&, const String\&) | 필요에 따라 네 개의 지정된 경로 세그먼트 사이에 디렉터리 구분자를 삽입하여 하나의 경로로 결합합니다. |
| static [GetDirectoryName](./getdirectoryname/)(const String\&) | 지정된 경로가 참조하는 디렉터리 이름을 반환합니다. |
| static [GetExtension](./getextension/)(const String\&) | 지정된 경로가 참조하는 파일의 확장자를 반환합니다. |
| static [GetFileName](./getfilename/)(const String\&) | 지정된 경로가 참조하는 파일 이름을 반환합니다. |
| static [GetFileNameWithoutExtension](./getfilenamewithoutextension/)(const String\&) | 지정된 경로가 참조하는 파일의 확장자 없는 이름을 반환합니다. |
| static [GetFullPath](./getfullpath/)(const String\&) | 지정된 경로를 절대 경로로 변환합니다. |
| static [GetInvalidFileNameChars](./getinvalidfilenamechars/)() | 파일 이름에 허용되지 않는 문자를 포함하는 배열을 반환합니다. |
| static [GetInvalidPathChars](./getinvalidpathchars/)() | 경로 이름에 허용되지 않는 문자를 포함하는 배열을 반환합니다. |
| static [GetPathRoot](./getpathroot/)(const String\&) | 지정된 경로의 루트 디렉터리를 반환합니다. |
| static [GetRandomFileName](./getrandomfilename/)() | 무작위로 생성된 파일 이름을 반환합니다. |
| static [GetTempFileName_](./gettempfilename_/)() | 고유한 이름을 가진 새 파일을 생성하고 해당 파일의 전체 경로를 반환합니다. |
| static [GetTempFileNameSafe](./gettempfilenamesafe/)() | 고유한 이름을 가진 새 파일을 생성하고 해당 파일의 전체 경로를 반환합니다. [GetTempFileName_()](./gettempfilename_/) 메서드의 동의어입니다. |
| static [GetTempPath](./gettemppath/)() | 현재 사용자의 임시 디렉터리 경로를 반환합니다. |
| static [HasExtension](./hasextension/)(const String\&) | 지정된 경로가 확장자를 가진 파일을 참조하는지 확인합니다. |
| static [IsPathRooted](./ispathrooted/)(const String\&) | 지정된 경로에 루트가 포함되어 있는지 확인합니다. |
| static [NormalizePath](./normalizepath/)(const String\&) | 지정된 경로를 정규화합니다. |
| static [ToBoost](./toboost/)(const String\&) | 지정된 경로를 나타내는 boost::filesystem::path 클래스의 인스턴스를 반환합니다. |
| static [ToString](./tostring/)(const boost::filesystem::path\&) | 지정된 Boost 경로 객체의 문자열 표현을 반환합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [AltDirectorySeparatorChar](./altdirectoryseparatorchar/) | 경로에서 디렉터리 수준을 구분하는 대체 문자입니다. |
| static [DirectorySeparatorChar](./directoryseparatorchar/) | 경로에서 디렉터리 수준을 구분하는 문자입니다. |
| static [PathSeparator](./pathseparator/) | 환경 변수에서 경로 문자열을 구분하는 구분자 문자입니다. |
| static [VolumeSeparatorChar](./volumeseparatorchar/) | 볼륨 구분자 문자입니다. |
## 비고



```cpp
#include "system/io/path.h"
#include <iostream>

int main()
{
  using namespace System::IO;

  // 무작위 파일 이름을 생성합니다.
  auto filename = Path::GetRandomFileName();

  // 파일 이름에 대한 정보를 출력합니다.
  std::cout <<
    "Filename: " << Path::GetFileName(filename) << std::endl <<
    "Filename w/o an extension: " << Path::GetFileNameWithoutExtension(filename) << std::endl <<
    "Extension: " << Path::GetExtension(filename) << std::endl;

  return 0;
}
/*
This code example produces the following output:
Filename: qhuzkyqv.y6p
Filename w/o an extension: qhuzkyqv
Extension: .y6p
*/
```

## 또 보기

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
