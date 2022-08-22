---
title: Aspose.ThreeD.Entities
second_title: Aspose.3D for .NET API Referansı
description: Tüm geometri ve varlıklar bu ad alanında tanımlanır
type: docs
weight: 40
url: /tr/net/aspose.threed.entities/
---
Tüm geometri ve varlıklar bu ad alanında tanımlanır

## sınıflar

| Sınıf | Tanım |
| --- | --- |
| [Box](./box) | Kutu. |
| [Camera](./camera) | Kamera, sahneye bakan izleyicinin bakış açısını tanımlar. |
| [Circle](./circle) | A[`Circle`](../aspose.threed.entities/circle) eğri, daire şeklinin kenarındaki bir dizi noktadan oluşur. |
| [CompositeCurve](./compositecurve) | A[`CompositeCurve`](../aspose.threed.entities/compositecurve) birkaç eğri parçasından oluşur. |
| [Curve](./curve) | Tüm eğri uygulamalarının temel sınıfı. |
| [Cylinder](./cylinder) | Parametreli Silindir. Ayrıca radiusTop/radiusBottom'dan biri sıfır olduğunda koniyi temsil etmek için kullanılabilir. |
| [Dish](./dish) | Parametreli çanak. |
| [Ellipse](./ellipse) | Bir[`Ellipse`](../aspose.threed.entities/ellipse)elips şeklini oluşturan bir dizi nokta tanımlar. |
| [Frustum](./frustum) | Şunun temel sınıfı[`Camera`](../aspose.threed.entities/camera) ve[`Light`](../aspose.threed.entities/light) |
| [Geometry](./geometry) | Tüm oluşturulabilir geometrik nesnelerin temel sınıfı (örn.[`Mesh`](../aspose.threed.entities/mesh) ,[`NurbsSurface`](../aspose.threed.entities/nurbssurface) ,[`Patch`](../aspose.threed.entities/patch) vb.). |
| [Light](./light) | Işık sahneyi aydınlatıyor. |
| [Line](./line) | Çoklu çizgi, bir dizi nokta tarafından tanımlanan bir yoldur.[`ControlPoints`](../aspose.threed.entities/geometry/controlpoints) tarafından bağlandı ve[`Segments`](../aspose.threed.entities/line/segments) , bu aynı zamanda bir dizi bağlantılı çizgi parçası olabileceği anlamına gelir. Çizgi genellikle doğrusal bir nesnedir, yani bir eğriyi temsil etmek için kullanılamaz, bir eğriyi temsil etmek için kullanır[`NurbsCurve`](../aspose.threed.entities/nurbscurve) . |
| [LinearExtrusion](./linearextrusion) | Doğrusal ekstrüzyon, girdi olarak 2B bir şekil alır ve şekli 3. boyutta genişletir. |
| [Mesh](./mesh) | Bir ağ, birçok n kenarlı çokgenden oluşur. |
| [NurbsCurve](./nurbscurve) | [NURBS eğrisi](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline) NURBS(Uniform olmayan rasyonel temel spline), ile temsil edilen bir eğridir.[`Order`](../aspose.threed.entities/nurbscurve/order) , ağırlıklı bir dizi[`ControlPoints`](../aspose.threed.entities/geometry/controlpoints) ve bir[`KnotVectors`](../aspose.threed.entities/nurbscurve/knotvectors) Kontrol noktasındaki w bileşeni, ne olursa olsun, kontrol noktasının ağırlığı olarak kullanılır.TwoDimensional veyaThreeDimensional |
| [NurbsDirection](./nurbsdirection) | Bir 3D[`NurbsSurface`](../aspose.threed.entities/nurbssurface) iki yönü vardır,[`U`](../aspose.threed.entities/nurbssurface/u) ve[`V`](../aspose.threed.entities/nurbssurface/v) ,[`NurbsDirection`](../aspose.threed.entities/nurbsdirection) her yön için veri tanımlar. Bir yön aslında bir NURBS eğrisidir, yani aynı zamanda kendi[`Order`](../aspose.threed.entities/nurbsdirection/order) , a[`KnotVectors`](../aspose.threed.entities/nurbsdirection/knotvectors) , ve bir dizi ağırlıklı kontrol noktası([`NurbsSurface`](../aspose.threed.entities/nurbssurface) ). |
| [NurbsSurface](./nurbssurface) | [`NurbsSurface`](../aspose.threed.entities/nurbssurface) ile temsil edilen bir yüzeydir[NURBS(Tekdüze olmayan rasyonel temel spline)](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline), A[`NurbsSurface`](../aspose.threed.entities/nurbssurface) iki ile tanımlanır[`NurbsDirection`](../aspose.threed.entities/nurbsdirection)[`U`](../aspose.threed.entities/nurbssurface/u) ve[`V`](../aspose.threed.entities/nurbssurface/v) . Yönün türü ne olursa olsun, kontrol noktasındaki w bileşeni, kontrol noktasının ağırlığı olarak kullanılır.TwoDimensional veyaThreeDimensional |
| [Patch](./patch) | A[`Patch`](../aspose.threed.entities/patch) benzer bir parametrik modelleme yüzeyidir.[`NurbsSurface`](../aspose.threed.entities/nurbssurface) , ayrıca iki ile tanımlanır[`PatchDirection`](../aspose.threed.entities/patchdirection) ,[`U`](../aspose.threed.entities/patch/u) ve[`V`](../aspose.threed.entities/patch/v) . Ama aradaki fark[`Patch`](../aspose.threed.entities/patch) ve[`NurbsSurface`](../aspose.threed.entities/nurbssurface) bu mu[`PatchDirection`](../aspose.threed.entities/patchdirection) eğrisi şunlardan biri olabilirBezier ,QuadraticBezier ,BasisSpline ,CardinalSpline veLinear |
| [PatchDirection](./patchdirection) | Yamanın U ve V yönü. |
| [Plane](./plane) | Parametrelendirilmiş düzlem. |
| [PointCloud](./pointcloud) | Nokta bulutu topoloji bilgisi içermez, sadece kontrol noktaları ve tepe elemanları içerir. |
| [PolygonBuilder](./polygonbuilder) | Çokgen oluşturmak için bir yardımcı sınıf[`Mesh`](../aspose.threed.entities/mesh) |
| [PolygonModifier](./polygonmodifier) | Çokgenleri değiştirmek için yardımcı programlar |
| [Primitive](./primitive) | Tüm ilkel öğeler için temel sınıf |
| [Pyramid](./pyramid) | Parametreli piramit. |
| [RectangularTorus](./rectangulartorus) | Parametreli dikdörtgen torus. |
| [RevolvedAreaSolid](./revolvedareasolid) | Bu sınıf, bir profil tarafından sağlanan bir kesiti bir eksen etrafında döndürerek katı bir modeli temsil eder. |
| [Shape](./shape) | Şekil, Maya'daki küme deforme ediciye benzer şekilde bir dizi kontrol noktasındaki deformasyonu tanımlar. Örneğin, oluşturulan bir geometriye bir şekil ekleyebiliriz. Ve şekil ve geometri, aynı topolojik bilgilere ancak kontrol noktalarının farklı konumlarına sahiptir. Değişken miktarlarda etki ile geometri bir deformasyon etkisi gerçekleştirir. |
| [Skeleton](./skeleton) | [`Skeleton`](../aspose.threed.entities/skeleton)esas olarak CAD yazılımı tarafından tasarımcının iskelet yapısının dönüşümünü manipüle etmesine yardımcı olmak için kullanılır, genellikle CAD yazılımları dışında işe yaramaz. CAD yazılımında iskelet hiyerarşisinin tek bir nesne gibi davranmasını sağlamak için, üst kısmı işaretlemek gerekir[`Skeleton`](../aspose.threed.entities/skeleton) ayarlayarak kök düğüm olarak düğüm[`Type`](../aspose.threed.entities/skeleton/type) ileSkeleton , ve tüm çocuklarBone |
| [Sphere](./sphere) | Parametreli küre. |
| [SweptAreaSolid](./sweptareasolid) | A[`SweptAreaSolid`](../aspose.threed.entities/sweptareasolid) profili bir directrix boyunca süpürerek bir geometri oluşturur. |
| [Torus](./torus) | Parametreli torus. |
| [TransformedCurve](./transformedcurve) | A[`TransformedCurve`](../aspose.threed.entities/transformedcurve) bir dönüşüm matrisi kullanarak bir eğriye yerleşim verir. Bu, bir[`TrimmedCurve`](../aspose.threed.entities/trimmedcurve) veya[`CompositeCurve`](../aspose.threed.entities/compositecurve) . |
| [TriMesh](./trimesh) | TriMesh, GPU tarafından doğrudan kullanılabilecek ham verileri içerir. Bu sınıf, yalnızca köşe başına verileri içeren bir ağ oluşturmaya yardımcı olan bir yardımcı programdır. |
| [TriMesh&lt;T&gt;](./trimesh-1) | Genel sürümü[`TriMesh`](../aspose.threed.entities/trimesh) kullanıcının statik tanımlı tepe noktası type için |
| [TrimmedCurve](./trimmedcurve) | Temel eğriyi her iki uçta budanan sınırlı bir eğri. |
| [VertexElement](./vertexelement) | Köşe öğelerinin temel sınıfı. Bir köşe öğesi türü VertexElementType tarafından tanımlanır. Bir VertexElement, köşe öğesinin bir geometri yüzeyine nasıl eşlendiğini ve eşleme bilgilerinin bellekte nasıl düzenlendiğini açıklar. Bir VertexElement, Normaller, UV'ler veya başka tür bilgiler içerir. |
| [VertexElementBinormal](./vertexelementbinormal) | Belirtilen bileşenler için binormal vektörleri tanımlar. |
| [VertexElementDoublesTemplate](./vertexelementdoublestemplate) | Betonu tanımlamak için bir yardımcı sınıf[`VertexElement`](../aspose.threed.entities/vertexelement) uygulamalar. |
| [VertexElementEdgeCrease](./vertexelementedgecrease) | Belirtilen bileşenler için kenar kıvrımını tanımlar |
| [VertexElementHole](./vertexelementhole) | Belirtilen poligonun hole olup olmadığını tanımlar |
| [VertexElementIntsTemplate](./vertexelementintstemplate) | Betonu tanımlamak için bir yardımcı sınıf[`VertexElement`](../aspose.threed.entities/vertexelement) uygulamalar. |
| [VertexElementMaterial](./vertexelementmaterial) | Belirtilen bileşenler için malzeme indeksini tanımlar. Bir düğümde birden fazla malzeme olabilir,[`VertexElementMaterial`](../aspose.threed.entities/vertexelementmaterial) geometrinin farklı kısımlarını farklı malzemelerde işlemek için kullanılır. |
| [VertexElementNormal](./vertexelementnormal) | Belirtilen bileşenler için normal vektörleri tanımlar. |
| [VertexElementPolygonGroup](./vertexelementpolygongroup) | İlgili çokgenleri birlikte gruplamak için belirtilen bileşenler için çokgen grubunu tanımlar. |
| [VertexElementSmoothingGroup](./vertexelementsmoothinggroup) | Yumuşatma grubu, bir çokgen ağ içinde düzgün bir yüzey oluşturuyor gibi görünmesi gereken bir çokgen grubudur. DOS için 3D studio max gibi bazı eski 3B modelleme yazılımları, her ağ tepe noktası için normal vektör depolamayı geçersiz kılmak için yumuşatma grubunu kullandı. |
| [VertexElementSpecular](./vertexelementspecular) | Belirtilen bileşenler için aynasal rengi tanımlar. |
| [VertexElementTangent](./vertexelementtangent) | Belirtilen bileşenler için teğet vektörleri tanımlar. |
| [VertexElementTemplate&lt;T&gt;](./vertexelementtemplate-1) | Betonu tanımlamak için bir yardımcı sınıf[`VertexElement`](../aspose.threed.entities/vertexelement) uygulamalar. |
| [VertexElementUserData](./vertexelementuserdata) | Belirtilen bileşenler için özel kullanıcı verilerini tanımlar. Genellikle özel amaçlı uygulamaya özel verilerdir. |
| [VertexElementUV](./vertexelementuv) | Belirtilen bileşenler için UV koordinatlarını tanımlar. Bir geometride birden çok[`VertexElementUV`](../aspose.threed.entities/vertexelementuv) elementler ve her birinin farklı[`TextureMapping`](../aspose.threed.entities/texturemapping) s. |
| [VertexElementVector4](./vertexelementvector4) | Betonu tanımlamak için bir yardımcı sınıf[`VertexElement`](../aspose.threed.entities/vertexelement) uygulamalar. |
| [VertexElementVertexColor](./vertexelementvertexcolor) | Belirtilen bileşenler için tepe rengini tanımlar |
| [VertexElementVertexCrease](./vertexelementvertexcrease) | Belirtilen bileşenler için tepe noktası kıvrımını tanımlar |
| [VertexElementVisibility](./vertexelementvisibility) | Belirtilen bileşenlerin görünür olup olmadığını tanımlar |
| [VertexElementWeight](./vertexelementweight) | Belirtilen bileşenler için karışım ağırlığını tanımlar. |
## Arayüzler

| Arayüz | Tanım |
| --- | --- |
| [IIndexedVertexElement](./iindexedvertexelement) | Dizin verileriyle VertexElement. |
| [IMeshConvertible](./imeshconvertible) | Bu arabirimi uygulayan varlıklar dönüştürülebilir[`Mesh`](../aspose.threed.entities/mesh) |
| [IOrientable](./iorientable) | Yönlendirilebilir varlıklar bu arabirimi uygular. |
## numaralandırma

| numaralandırma | Tanım |
| --- | --- |
| [ApertureMode](./aperturemode) | Kamera açıklık modları. Açıklık modu, kamera açıklığını hangi değerlerin yönlendirdiğini belirler. Diyafram modu HorizAndVert, Horizontal veya Vertical ise, görüş alanı kullanılır. Diyafram modu Odak Uzunluğu ise, odak uzaklığı kullanılır. |
| [CurveDimension](./curvedimension) | Eğrilerin boyutu. |
| [LightType](./lighttype) | Hafif türler. |
| [MappingMode](./mappingmode) | Öğenin bir yüzeye nasıl eşlendiğini belirler. [`MappingMode`](../aspose.threed.entities/mappingmode) nasıl tanımlandı[`VertexElement`](../aspose.threed.entities/vertexelement) geometrinin yüzeyine eşlenir. |
| [NurbsType](./nurbstype) | NURBS türleri. |
| [PatchDirectionType](./patchdirectiontype) | Yama yönünün türleri. |
| [ProjectionType](./projectiontype) | Kameranın projeksiyon türleri. |
| [ReferenceMode](./referencemode) | [`ReferenceMode`](../aspose.threed.entities/referencemode) eşleme bilgilerinin nasıl depolandığını ve tarafından başvurulduğunu tanımlar. |
| [RotationMode](./rotationmode) | Frustum'un dönüş modu |
| [SkeletonType](./skeletontype) | [`Skeleton`](../aspose.threed.entities/skeleton) türleri. |
| [SplitMeshPolicy](./splitmeshpolicy) | Köşe/kontrol noktası verilerini alt ağlar arasında paylaşın veya her alt ağ kendi sıkıştırılmış verisine sahiptir. |
| [TextureMapping](./texturemapping) | için doku eşleme türü[`VertexElementUV`](../aspose.threed.entities/vertexelementuv) Hangi tür doku eşlemenin kullanıldığını açıklar. |
| [VertexElementType](./vertexelementtype) | Modellemede nasıl kullanılacağını tanımlayan köşe elemanının türü. |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
