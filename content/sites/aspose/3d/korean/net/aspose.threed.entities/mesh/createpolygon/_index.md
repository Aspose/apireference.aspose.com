---
title: CreatePolygon
second_title: .NET API 참조용 Aspose.3D
description: 정의된 모든 꼭지점으로 새 다각형을 만듭니다.indices . 꼭지점별로 다각형 꼭지점을 만들려면 다음을 사용하십시오.PolygonBuilderaspose.threed.entities/polygonbuilder/ .
type: docs
weight: 50
url: /ko/net/aspose.threed.entities/mesh/createpolygon/
---
## CreatePolygon(int[], int, int) {#createpolygon_3}

정의된 모든 꼭지점으로 새 다각형을 만듭니다.*indices* . 꼭지점별로 다각형 꼭지점을 만들려면 다음을 사용하십시오.[`PolygonBuilder`](../../polygonbuilder/) .

```csharp
public void CreatePolygon(int[] indices, int offset, int length)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| indices | Int32[] | 폴리곤 인덱스의 배열. 각 인덱스는 폴리곤을 형성하는 제어점을 가리킵니다. |
| offset | Int32 | 첫 번째 폴리곤 인덱스의 오프셋 |
| length | Int32 | 인덱스의 길이 |

### 예

```csharp
int[] indices = new int[] {0, 1, 2};
mesh.CreatePolygon(indices);
```

### 또한보십시오

* class [Mesh](../)
* 네임스페이스 [Aspose.ThreeD.Entities](../../mesh/)
* 집회 [Aspose.3D](../../../)

---

## CreatePolygon(int[]) {#createpolygon_2}

정의된 모든 꼭지점으로 새 다각형을 만듭니다.*indices* . 꼭지점별로 다각형 꼭지점을 만들려면 다음을 사용하십시오.[`PolygonBuilder`](../../polygonbuilder/) .

```csharp
public void CreatePolygon(int[] indices)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| indices | Int32[] | 폴리곤 인덱스의 배열. 각 인덱스는 폴리곤을 형성하는 제어점을 가리킵니다. |

### 예

```csharp
int[] indices = new int[] {0, 1, 2};
mesh.CreatePolygon(indices);
```

### 또한보십시오

* class [Mesh](../)
* 네임스페이스 [Aspose.ThreeD.Entities](../../mesh/)
* 집회 [Aspose.3D](../../../)

---

## CreatePolygon(int, int, int, int) {#createpolygon_1}

꼭지점이 4개인 폴리곤 생성(쿼드)

```csharp
public void CreatePolygon(int v1, int v2, int v3, int v4)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| v1 | Int32 | 첫 번째 정점의 인덱스 |
| v2 | Int32 | 두 번째 정점의 인덱스 |
| v3 | Int32 | 세 번째 정점의 인덱스 |
| v4 | Int32 | 네 번째 정점의 인덱스 |

### 또한보십시오

* class [Mesh](../)
* 네임스페이스 [Aspose.ThreeD.Entities](../../mesh/)
* 집회 [Aspose.3D](../../../)

---

## CreatePolygon(int, int, int) {#createpolygon}

꼭짓점이 3개인 폴리곤 생성(삼각형)

```csharp
public void CreatePolygon(int v1, int v2, int v3)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| v1 | Int32 | 첫 번째 정점의 인덱스 |
| v2 | Int32 | 두 번째 정점의 인덱스 |
| v3 | Int32 | 세 번째 정점의 인덱스 |

### 또한보십시오

* class [Mesh](../)
* 네임스페이스 [Aspose.ThreeD.Entities](../../mesh/)
* 집회 [Aspose.3D](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
