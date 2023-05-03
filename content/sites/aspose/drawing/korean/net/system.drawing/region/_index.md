---
title: Class Region
second_title: .NET API 참조용 Aspose.Drawing
description: System.Drawing.Region 수업. 직사각형과 경로로 구성된 그래픽 모양의 내부를 설명합니다. 이 클래스는 상속될 수 없습니다.
type: docs
weight: 1060
url: /ko/net/system.drawing/region/
---
## Region class

직사각형과 경로로 구성된 그래픽 모양의 내부를 설명합니다. 이 클래스는 상속될 수 없습니다.

```csharp
public sealed class Region : IDisposable
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [Region](region/#constructor)() | 의 새 인스턴스를 초기화합니다.`Region` 클래스. |
| [Region](region/#constructor_1)(GraphicsPath) | 의 새 인스턴스를 초기화합니다.`Region` 지정된 클래스GraphicsPath . |
| [Region](region/#constructor_3)(Rectangle) | 의 새 인스턴스를 초기화합니다.`Region` 지정된 클래스Rectangle 구조. |
| [Region](region/#constructor_4)(RectangleF) | 의 새 인스턴스를 초기화합니다.`Region` 지정된 클래스RectangleF 구조. |
| [Region](region/#constructor_2)(RegionData) | 의 새 인스턴스를 초기화합니다.`Region` 지정된 data. 의 클래스 |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Clone](../../system.drawing/region/clone/)() | 이것의 정확한 복사본을 만듭니다.Region . |
| [Complement](../../system.drawing/region/complement/#complement)(GraphicsPath) | 업데이트Region 지정된 부분을 포함하려면GraphicsPath that does 는 이것과 교차하지 않습니다Region . |
| [Complement](../../system.drawing/region/complement/#complement_1)(Rectangle) | 업데이트Region 지정된 부분을 포함하려면Rectangle 이것과 교차하지 않는 structure Region . |
| [Complement](../../system.drawing/region/complement/#complement_2)(RectangleF) | 업데이트Region 지정된 부분을 포함하려면RectangleF 이것과 교차하지 않는 structure Region . |
| [Complement](../../system.drawing/region/complement/#complement_3)(Region) | 업데이트Region 지정된 부분을 포함하려면Regionnot 이것과 교차하지 않는Region . |
| [Dispose](../../system.drawing/region/dispose/)() | 이에서 사용하는 모든 리소스를 해제합니다.Region . |
| [Equals](../../system.drawing/region/equals/#equals)(Region, Graphics) | 지정된Region 이것과 동일하다Region 지정된 도면 표면의 . |
| [Exclude](../../system.drawing/region/exclude/#exclude)(GraphicsPath) | 업데이트Region 지정된 와 교차하지 않는 내부 부분만 포함GraphicsPath . |
| [Exclude](../../system.drawing/region/exclude/#exclude_1)(Rectangle) | 업데이트Region 지정된 것과 교차 하지 않는 내부 부분만 포함합니다.Rectangle 구조. |
| [Exclude](../../system.drawing/region/exclude/#exclude_2)(RectangleF) | 업데이트Region 지정된 와 교차하지 않는 내부 부분만 포함RectangleF 구조. |
| [Exclude](../../system.drawing/region/exclude/#exclude_3)(Region) | 업데이트Region 지정된 것과 교차 하지 않는 내부 부분만 포함합니다.Region . |
| [GetBounds](../../system.drawing/region/getbounds/)(Graphics) | 가져오기RectangleF 이것을 경계로 하는 사각형을 나타내는 구조체Region 의 도면 표면에Graphics object. |
| [GetRegionData](../../system.drawing/region/getregiondata/)() | 반환RegionData 이를 설명하는 정보를 나타내는Region . |
| [GetRegionScans](../../system.drawing/region/getregionscans/)(Matrix) | 배열을 반환합니다.RectangleF 이를 근사한 구조Region 지정된 매트릭스 변환이 적용된 후. |
| [Intersect](../../system.drawing/region/intersect/#intersect)(GraphicsPath) | 업데이트Region 지정된GraphicsPath . |
| [Intersect](../../system.drawing/region/intersect/#intersect_1)(Rectangle) | 업데이트Region 지정된Rectangle 구조. |
| [Intersect](../../system.drawing/region/intersect/#intersect_2)(RectangleF) | 업데이트Region 자신과 specified 의 교차점에RectangleF 구조. |
| [Intersect](../../system.drawing/region/intersect/#intersect_3)(Region) | 업데이트Region 지정된Region . |
| [IsEmpty](../../system.drawing/region/isempty/)(Graphics) | 이 여부를 테스트합니다.Region 지정된 도면 표면에 빈 내부가 있습니다. |
| [IsInfinite](../../system.drawing/region/isinfinite/)(Graphics) | 이 여부를 테스트합니다.Region 지정된 도면 표면에 무한한 내부가 있습니다. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_7)(Point) | 지정된Point 구조는 이 안에 포함되어 있습니다.Region . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_9)(PointF) | 지정된PointF 구조는 이 안에 포함되어 있습니다.Region . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_11)(Rectangle) | 지정된 부분이Rectangle 구조는 this 내에 포함되어 있습니다.Region . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_13)(RectangleF) | 지정된 부분이RectangleF 구조는 this 내에 포함되어 있습니다.Region . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_3)(float, float) | 지정된 점이 이 안에 포함되는지 여부를 테스트합니다.Region . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_8)(Point, Graphics) | 지정된Point 구조는 이 안에 포함되어 있습니다.Region 지정된 것을 사용하여 그릴 때Graphics . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_10)(PointF, Graphics) | 지정된PointF 구조는 이 안에 포함되어 있습니다.Region 지정된 것을 사용하여 그릴 때Graphics . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_12)(Rectangle, Graphics) | 지정된 부분이Rectangle 구조는 this 내에 포함되어 있습니다.Region 지정된 것을 사용하여 그릴 때Graphics . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_14)(RectangleF, Graphics) | 지정된 부분이RectangleF 구조는 this 내에 포함되어 있습니다.Region 지정된 것을 사용하여 그릴 때Graphics . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_6)(float, float, Graphics) | 지정된 점이 이 안에 포함되는지 여부를 테스트합니다.Region using 를 그릴 때 지정된Graphics. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_2)(int, int, Graphics) | 지정된 점이 이 안에 포함되는지 여부를 테스트합니다.Region using 지정된 객체를 그릴 때Graphics object. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_4)(float, float, float, float) | 지정된 사각형의 일부가 이 안에 포함되는지 여부를 테스트합니다.Region . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible)(int, int, int, int) | 지정된 사각형의 일부가 이 안에 포함되는지 여부를 테스트합니다.Region . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_5)(float, float, float, float, Graphics) | 지정된 사각형의 일부가 이 안에 포함되는지 여부를 테스트합니다.Region 지정된 것을 사용하여 그릴 때Graphics . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_1)(int, int, int, int, Graphics) | 지정된 사각형의 일부가 이 안에 포함되는지 여부를 테스트합니다.Region 지정된 것을 사용하여 drawn 때Graphics . |
| [MakeEmpty](../../system.drawing/region/makeempty/)() | 초기화Region 텅 빈 실내로. |
| [MakeInfinite](../../system.drawing/region/makeinfinite/)() | 초기화Region 무한한 내부에 객체. |
| [Transform](../../system.drawing/region/transform/)(Matrix) | 이것을 변환Region 지정된Matrix . |
| [Translate](../../system.drawing/region/translate/#translate_1)(float, float) | 이 좌표를 오프셋합니다.Region 지정된 금액만큼. |
| [Translate](../../system.drawing/region/translate/#translate)(int, int) | 이 좌표를 오프셋합니다.Region 지정된 금액만큼. |
| [Union](../../system.drawing/region/union/#union)(GraphicsPath) | 업데이트Region 자신과 지정된GraphicsPath . |
| [Union](../../system.drawing/region/union/#union_1)(Rectangle) | 업데이트Region 자신과 지정된Rectangle 구조. |
| [Union](../../system.drawing/region/union/#union_2)(RectangleF) | 업데이트Region 자신과 지정된RectangleF 구조. |
| [Union](../../system.drawing/region/union/#union_3)(Region) | 업데이트Region 자신과 지정된Region . |
| [Xor](../../system.drawing/region/xor/#xor)(GraphicsPath) | 업데이트Region 지정된 the 와 자체의 교집합을 뺀 합집합으로GraphicsPath . |
| [Xor](../../system.drawing/region/xor/#xor_1)(Rectangle) | 업데이트Region 지정된 the 와 자체의 교집합을 뺀 합집합으로Rectangle 구조. |
| [Xor](../../system.drawing/region/xor/#xor_2)(RectangleF) | 업데이트Region 합집합에서 자체 with 의 교차점을 뺀 지정된RectangleF 구조. |
| [Xor](../../system.drawing/region/xor/#xor_3)(Region) | 업데이트Region 지정된 the 와 자체의 교집합을 뺀 합집합으로Region . |

### 또한보십시오

* 네임스페이스 [System.Drawing](../../system.drawing/)
* 집회 [Aspose.Drawing](../../)


