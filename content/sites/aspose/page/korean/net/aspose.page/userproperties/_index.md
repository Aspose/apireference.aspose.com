---
title: Class UserProperties
second_title: .NET API 참조용 Aspose.Page
description: Aspose.Page.UserProperties 수업. 유형이 지정된 속성을 설정하고 반환할 수 있는 특수 속성 클래스입니다. 또한 이 속성 개체에 속성이 포함되어 있지 않은 경우 두 개의 기본 속성 objects 의 연결을 검색할 수 있습니다.
type: docs
weight: 320
url: /ko/net/aspose.page/userproperties/
---
## UserProperties class

유형이 지정된 속성을 설정하고 반환할 수 있는 특수 속성 클래스입니다. 또한 이 속성 개체에 속성이 포함되어 있지 않은 경우 두 개의 기본 속성 objects 의 연결을 검색할 수 있습니다.

```csharp
public class UserProperties : Dictionary<string, object>
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [UserProperties](userproperties/#constructor)() | UserProperties 클래스의 빈 인스턴스를 초기화합니다. |
| [UserProperties](userproperties/#constructor_1)(Dictionary&lt;string, object&gt;) | 기본값으로 UserProperties 클래스를 초기화합니다. |
| [UserProperties](userproperties/#constructor_2)(Dictionary&lt;string, object&gt;, Dictionary&lt;string, object&gt;) | 해당 순서로 검색되는 기본값 및 altDefaults 테이블, 로 UserProperties를 구성합니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| virtual [Properties](../../aspose.page/userproperties/properties/) { set; } | 기본값을 포함하여 속성을 이 UserProperties 에 복사합니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| virtual [GetProperty](../../aspose.page/userproperties/getproperty/#getproperty)(string) | 문자열 속성 값을 가져옵니다. |
| virtual [GetProperty](../../aspose.page/userproperties/getproperty/#getproperty_1)(string, string) | 문자열 속성 값을 가져옵니다. 요청된 속성이 없으면 제공된 기본값을 반환합니다. |
| virtual [GetPropertyColor](../../aspose.page/userproperties/getpropertycolor/#getpropertycolor)(string) | 색상 속성 값을 가져옵니다. |
| virtual [GetPropertyColor](../../aspose.page/userproperties/getpropertycolor/#getpropertycolor_1)(string, Color) | 색상 속성 값을 가져옵니다. 요청된 속성이 없으면 제공된 기본값을 반환합니다. |
| virtual [GetPropertyDouble](../../aspose.page/userproperties/getpropertydouble/#getpropertydouble)(string) | 이중 속성 값을 가져옵니다. |
| virtual [GetPropertyDouble](../../aspose.page/userproperties/getpropertydouble/#getpropertydouble_1)(string, double) | 이중 속성 값을 가져옵니다. 요청된 속성이 없으면 제공된 기본값을 반환합니다. |
| virtual [GetPropertyFloat](../../aspose.page/userproperties/getpropertyfloat/#getpropertyfloat)(string) | 부동 속성 값을 가져옵니다. |
| virtual [GetPropertyFloat](../../aspose.page/userproperties/getpropertyfloat/#getpropertyfloat_1)(string, float) | float 속성 값을 가져옵니다. 요청된 속성이 없으면 제공된 기본값을 반환합니다. |
| virtual [GetPropertyInt](../../aspose.page/userproperties/getpropertyint/#getpropertyint)(string) | 정수 속성 값을 가져옵니다. |
| virtual [GetPropertyInt](../../aspose.page/userproperties/getpropertyint/#getpropertyint_1)(string, int) | 정수 속성 값을 가져옵니다. 요청된 속성이 없으면 제공된 기본값을 반환합니다. |
| virtual [GetPropertyMargins](../../aspose.page/userproperties/getpropertymargins/#getpropertymargins)(string) | 여백 속성 값을 가져옵니다. |
| virtual [GetPropertyMargins](../../aspose.page/userproperties/getpropertymargins/#getpropertymargins_1)(string, Margins) | 여백 속성 값을 가져옵니다. 요청된 속성이 없으면 제공된 기본값을 반환합니다. |
| virtual [GetPropertyRectangle](../../aspose.page/userproperties/getpropertyrectangle/#getpropertyrectangle)(string) | 사각형 속성 값을 가져옵니다. |
| virtual [GetPropertyRectangle](../../aspose.page/userproperties/getpropertyrectangle/#getpropertyrectangle_1)(string, RectangleF) | 사각형 속성 값을 가져옵니다. 요청된 속성이 없으면 제공된 기본값을 반환합니다. |
| virtual [GetPropertySize](../../aspose.page/userproperties/getpropertysize/#getpropertysize)(string) | 크기 속성 값을 가져옵니다. |
| virtual [GetPropertySize](../../aspose.page/userproperties/getpropertysize/#getpropertysize_1)(string, Size) | 크기 속성 값을 가져옵니다. 요청된 속성이 없으면 제공된 기본값을 반환합니다. |
| virtual [GetPropertyStringArray](../../aspose.page/userproperties/getpropertystringarray/#getpropertystringarray)(string) | 문자열 배열 속성 값을 가져옵니다. |
| virtual [GetPropertyStringArray](../../aspose.page/userproperties/getpropertystringarray/#getpropertystringarray_1)(string, string[]) | 문자열 배열 속성 값을 가져옵니다. 요청된 속성이 없으면 제공된 기본값을 반환합니다. |
| virtual [IsProperty](../../aspose.page/userproperties/isproperty/#isproperty)(string) | 부울 속성 값을 가져옵니다. |
| virtual [IsProperty](../../aspose.page/userproperties/isproperty/#isproperty_1)(string, bool) | 부울 속성 값을 가져옵니다. 요청된 속성이 없으면 제공된 기본값을 반환합니다. |
| virtual [PrintProperties](../../aspose.page/userproperties/printproperties/)() |  |
| virtual [PropertyNames](../../aspose.page/userproperties/propertynames/)() | 속성 이름을 반환합니다. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_1)(string, bool) | 부울 속성 값을 설정합니다. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_5)(string, Color) | 색상 속성 값을 설정합니다. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_2)(string, double) | 이중 속성 값을 설정합니다. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_4)(string, float) | 부동 속성 값을 설정합니다. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_3)(string, int) | 정수 속성 값을 설정합니다. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty)(string, Margins) | 여백 속성 값을 설정합니다. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_6)(string, Rectangle) | 사각형 속성 값을 설정합니다. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_7)(string, Size) | 크기 속성 값을 설정합니다. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_8)(string, string) | 문자열 속성 값을 설정합니다. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_9)(string, string[]) | 문자열 배열 속성 값을 설정합니다. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_1)(Dictionary&lt;string, object&gt;, string, bool) | 지정된 속성 테이블에서 부울 속성 값을 설정합니다. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_5)(Dictionary&lt;string, object&gt;, string, Color) | 지정된 속성 테이블에서 색상 속성 값을 설정합니다. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_2)(Dictionary&lt;string, object&gt;, string, double) | 지정된 속성 테이블에서 이중 속성 값을 설정합니다. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_4)(Dictionary&lt;string, object&gt;, string, float) | 지정된 속성 테이블에서 부동 속성 값을 설정합니다. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_3)(Dictionary&lt;string, object&gt;, string, int) | 지정된 속성 테이블에서 정수 속성 값을 설정합니다. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty)(Dictionary&lt;string, object&gt;, string, Margins) | 지정된 속성 테이블에서 여백 속성 값을 설정합니다. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_6)(Dictionary&lt;string, object&gt;, string, Rectangle) | 지정된 속성 테이블에서 사각형 속성 값을 설정합니다. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_7)(Dictionary&lt;string, object&gt;, string, Size) | 지정된 속성 테이블에서 크기 속성 값을 설정합니다. |
| static [SetProperty](../../aspose.page/userproperties/setproperty/#setproperty_8)(Dictionary&lt;string, object&gt;, string, string[]) | 지정된 속성 테이블에서 문자열 배열 속성 값을 설정합니다. |

### 또한보십시오

* 네임스페이스 [Aspose.Page](../../aspose.page/)
* 집회 [Aspose.Page](../../)


