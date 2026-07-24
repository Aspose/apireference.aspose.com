---
title: "System::IO::DirectoryInfo 클래스"
linktitle: "DirectoryInfo"
second_title: "C++용 Aspose.Page"
description: "System::IO::DirectoryInfo 클래스. 파일 시스템 경로와 해당 경로가 가리키는 디렉터리를 나타내며 디렉터리를 조작하기 위한 인스턴스 메서드를 제공합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인자로 전달하도록 사용하십시오."
type: docs
weight: 1200
url: /ko/cpp/system.io/directoryinfo/
---
## DirectoryInfo class


파일 시스템 경로와 해당 경로가 가리키는 디렉터리를 나타내며 디렉터리를 조작하기 위한 인스턴스 메서드를 제공합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하도록 사용하십시오.

```cpp
class DirectoryInfo : public System::IO::FileSystemInfo
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Create](./create/)() | 현재 객체가 나타내는 경로에 디렉터리를 생성합니다. |
| [CreateSubdirectory](./createsubdirectory/)(const String\&) | 지정된 경로에 하위 디렉터리를 생성합니다. |
| [Delete](./delete/)() override | 현재 객체가 나타내는 경로가 가리키는 디렉터리가 비어 있는 경우 해당 디렉터리를 제거합니다. |
| [Delete](./delete/)(bool) | 현재 객체가 나타내는 경로가 가리키는 디렉터리를 제거합니다. 매개변수는 디렉터리가 비어 있지 않을 경우 내용물을 재귀적으로 제거할지 여부를 지정합니다. |
| [DirectoryInfo](./directoryinfo/)(const String\&) | 지정된 경로에 [DirectoryInfo](./) 클래스의 인스턴스를 생성합니다. |
| [EnumerateDirectories](./enumeratedirectories/)() | 현재 객체가 나타내는 디렉터리 내에 위치한 모든 디렉터리를 포함하는 열거 가능한 컬렉션을 반환합니다. |
| [EnumerateDirectories](./enumeratedirectories/)(const String\&) | 현재 객체가 나타내는 디렉터리에서 지정된 검색 기준을 만족하는 디렉터리를 검색합니다. |
| [EnumerateDirectories](./enumeratedirectories/)(const String\&, SearchOption) | 현재 객체가 나타내는 디렉터리 또는 해당 디렉터리를 루트로 하는 전체 디렉터리 트리에서 지정된 검색 기준을 만족하는 디렉터리를 검색합니다. |
| [EnumerateFiles](./enumeratefiles/)() | 현재 객체가 나타내는 디렉터리에 위치한 모든 파일을 포함하는 열거 가능한 컬렉션을 반환합니다. |
| [EnumerateFiles](./enumeratefiles/)(const String\&) | 현재 객체가 나타내는 디렉터리에서 지정된 검색 기준을 만족하는 파일을 검색합니다. |
| [EnumerateFiles](./enumeratefiles/)(const String\&, SearchOption) | 현재 객체가 나타내는 디렉터리 또는 해당 디렉터리를 루트로 하는 전체 디렉터리 트리에서 지정된 검색 기준을 만족하는 파일을 검색합니다. |
| [EnumerateFileSystemInfos](./enumeratefilesysteminfos/)() | 현재 객체가 나타내는 디렉터리에 위치한 모든 파일 및 디렉터리를 포함하는 열거 가능한 컬렉션을 반환합니다. |
| [EnumerateFileSystemInfos](./enumeratefilesysteminfos/)(const String\&) | 현재 객체가 나타내는 디렉터리에서 지정된 검색 기준을 만족하는 파일 및 디렉터리를 검색합니다. |
| [EnumerateFileSystemInfos](./enumeratefilesysteminfos/)(const String\&, SearchOption) | 현재 객체가 나타내는 디렉터리 또는 해당 디렉터리를 루트로 하는 전체 디렉터리 트리에서 지정된 검색 기준을 만족하는 파일 및 디렉터리를 검색합니다. |
| [get_Exists](./get_exists/)() override | 현재 객체가 나타내는 경로가 기존 디렉터리를 가리키는지 확인합니다. |
| [get_Name](./get_name/)() override | 현재 객체가 나타내는 경로가 가리키는 엔터티의 이름을 반환합니다. |
| [get_Parent](./get_parent/)() | 현재 객체가 나타내는 디렉터리의 상위 디렉터리를 가리키는 경로를 나타내는 [DirectoryInfo](./) 객체에 대한 공유 포인터를 반환합니다. |
| [get_Root](./get_root/)() | 현재 객체가 나타내는 디렉터리의 루트 디렉터리를 가리키는 경로를 나타내는 [DirectoryInfo](./) 객체에 대한 공유 포인터를 반환합니다. |
| [GetDirectories](./getdirectories/)() | 현재 객체가 나타내는 디렉터리에 위치한 모든 디렉터리를 나타내는 [DirectoryInfo](./) 객체에 대한 공유 포인터를 포함하는 배열을 반환합니다. |
| [GetDirectories](./getdirectories/)(const String\&) | 현재 객체가 나타내는 디렉터리에서 지정된 검색 기준을 만족하는 디렉터리를 검색합니다. |
| [GetDirectories](./getdirectories/)(const String\&, SearchOption) | 현재 객체가 나타내는 디렉터리 또는 해당 디렉터리를 루트로 하는 전체 디렉터리 트리에서 지정된 검색 기준을 만족하는 디렉터리를 검색합니다. |
| [GetFiles](./getfiles/)() | 현재 객체가 나타내는 디렉터리에 위치한 모든 디렉터리를 나타내는 [FileInfo](../fileinfo/) 객체에 대한 공유 포인터를 포함하는 배열을 반환합니다. |
| [GetFiles](./getfiles/)(const String\&) | 현재 객체가 나타내는 디렉터리에서 지정된 검색 기준을 만족하는 파일을 검색합니다. |
| [GetFiles](./getfiles/)(const String\&, SearchOption) | 현재 객체가 나타내는 디렉터리 또는 해당 디렉터리를 루트로 하는 전체 디렉터리 트리에서 지정된 검색 기준을 만족하는 파일을 검색합니다. |
| [GetFileSystemInfos](./getfilesysteminfos/)() | 현재 객체가 나타내는 디렉터리에 위치한 모든 파일 및 디렉터리를 나타내는 [FileSystemInfo](../filesysteminfo/) 객체에 대한 공유 포인터를 포함하는 배열을 반환합니다. |
| [GetFileSystemInfos](./getfilesysteminfos/)(const String\&) | 현재 객체가 나타내는 디렉터리에서 지정된 검색 기준을 만족하는 파일 및 디렉터리를 검색합니다. |
| [GetFileSystemInfos](./getfilesysteminfos/)(const String\&, SearchOption) | 현재 객체가 나타내는 디렉터리 또는 해당 디렉터리를 루트로 하는 전체 디렉터리 트리에서 지정된 검색 기준을 만족하는 파일 및 디렉터리를 검색합니다. |
| [MoveTo](./moveto/)(const String\&) | 현재 객체가 나타내는 디렉터리와 그 모든 내용을 지정된 위치로 이동합니다. |
| [ToString](./tostring/)() const override | 현재 객체가 나타내는 경로를 포함하는 문자열을 반환합니다. |
## 또 보기

* Class [FileSystemInfo](../filesysteminfo/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
