---
title: Aspose.ThreeD.Entities
second_title: Riferimento API Aspose.3D per .NET
description: Tutta la geometria e le entità sono definite in questo spazio dei nomi
type: docs
weight: 40
url: /it/net/aspose.threed.entities/
---
Tutta la geometria e le entità sono definite in questo spazio dei nomi

## Classi

| Classe | Descrizione |
| --- | --- |
| [Box](./box) | Casella. |
| [Camera](./camera) | La telecamera descrive il punto di vista dello spettatore che guarda la scena. |
| [Circle](./circle) | A[`Circle`](../aspose.threed.entities/circle) la curva consiste in un insieme di punti nel bordo della forma del cerchio. |
| [CompositeCurve](./compositecurve) | A[`CompositeCurve`](../aspose.threed.entities/compositecurve) è costituito da diversi segmenti di curva. |
| [Curve](./curve) | La classe base di tutte le implementazioni di curve. |
| [Cylinder](./cylinder) | Cilindro parametrizzato. Può essere utilizzato anche per rappresentare il cono quando uno di raggioTop/radiusBottom è zero. |
| [Dish](./dish) | Parabola parametrizzata. |
| [Ellipse](./ellipse) | An[`Ellipse`](../aspose.threed.entities/ellipse)definisce un insieme di punti che formano la forma dell'ellisse. |
| [Frustum](./frustum) | La classe base di[`Camera`](../aspose.threed.entities/camera) e[`Light`](../aspose.threed.entities/light) |
| [Geometry](./geometry) | La classe base di tutti gli oggetti geometrici renderizzabili (come[`Mesh`](../aspose.threed.entities/mesh) ,[`NurbsSurface`](../aspose.threed.entities/nurbssurface) ,[`Patch`](../aspose.threed.entities/patch) e così via). |
| [Light](./light) | La luce illumina la scena. |
| [Line](./line) | Una polilinea è un percorso definito da un insieme di punti con[`ControlPoints`](../aspose.threed.entities/geometry/controlpoints) , e collegato da[`Segments`](../aspose.threed.entities/line/segments) , che significa che può anche essere un insieme di segmenti di linea collegati. La linea è solitamente un oggetto lineare, il che significa che non può essere utilizzata per rappresentare una curva, per rappresentare una curva, utilizza[`NurbsCurve`](../aspose.threed.entities/nurbscurve) . |
| [LinearExtrusion](./linearextrusion) | L'estrusione lineare prende una forma 2D come input ed estende la forma nella 3a dimensione. |
| [Mesh](./mesh) | Una mesh è composta da molti poligoni a n lati. |
| [NurbsCurve](./nurbscurve) | [curva NURBS](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline) è una curva rappresentata da NURBS(Spline di base razionale non uniforme), Una curva NURBS è definita dalla sua[`Order`](../aspose.threed.entities/nurbscurve/order) , un insieme di pesi[`ControlPoints`](../aspose.threed.entities/geometry/controlpoints) e un[`KnotVectors`](../aspose.threed.entities/nurbscurve/knotvectors) Il componente w nel punto di controllo viene utilizzato come peso del punto di controllo, qualunque esso sia aTwoDimensional oThreeDimensional |
| [NurbsDirection](./nurbsdirection) | Un 3D[`NurbsSurface`](../aspose.threed.entities/nurbssurface) ha due direzioni, il[`U`](../aspose.threed.entities/nurbssurface/u) e[`V`](../aspose.threed.entities/nurbssurface/v) , il[`NurbsDirection`](../aspose.threed.entities/nurbsdirection) definisce i dati per ciascuna direzione. Una direzione è in realtà una curva NURBS, ciò significa che è definita anche dalla sua[`Order`](../aspose.threed.entities/nurbsdirection/order) , un[`KnotVectors`](../aspose.threed.entities/nurbsdirection/knotvectors) e un insieme di punti di controllo ponderati (definiti in[`NurbsSurface`](../aspose.threed.entities/nurbssurface) ). |
| [NurbsSurface](./nurbssurface) | [`NurbsSurface`](../aspose.threed.entities/nurbssurface) è una superficie rappresentata da[NURBS (spline di base razionale non uniforme)](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline), A[`NurbsSurface`](../aspose.threed.entities/nurbssurface) è definito da due[`NurbsDirection`](../aspose.threed.entities/nurbsdirection)[`U`](../aspose.threed.entities/nurbssurface/u) e[`V`](../aspose.threed.entities/nurbssurface/v) . Il componente w nel punto di controllo viene utilizzato come peso del punto di controllo qualunque sia il tipo di direzione aTwoDimensional oThreeDimensional |
| [Patch](./patch) | A[`Patch`](../aspose.threed.entities/patch) è una superficie di modellazione parametrica, simile a[`NurbsSurface`](../aspose.threed.entities/nurbssurface) , è anche definito da due [`PatchDirection`](../aspose.threed.entities/patchdirection) , il[`U`](../aspose.threed.entities/patch/u) e[`V`](../aspose.threed.entities/patch/v) . Ma differenza tra[`Patch`](../aspose.threed.entities/patch) e[`NurbsSurface`](../aspose.threed.entities/nurbssurface) è che il[`PatchDirection`](../aspose.threed.entities/patchdirection) la curva può essere una diBezier ,QuadraticBezier ,BasisSpline ,CardinalSpline eLinear |
| [PatchDirection](./patchdirection) | Direzione U e V della patch. |
| [Plane](./plane) | Piano parametrizzato. |
| [PointCloud](./pointcloud) | La nuvola di punti non contiene informazioni sulla topologia ma solo i punti di controllo e gli elementi del vertice. |
| [PolygonBuilder](./polygonbuilder) | Una classe di supporto per la creazione di poligoni[`Mesh`](../aspose.threed.entities/mesh) |
| [PolygonModifier](./polygonmodifier) | Utilità per modificare i poligoni |
| [Primitive](./primitive) | Classe base per tutte le primitive |
| [Pyramid](./pyramid) | Piramide parametrizzata. |
| [RectangularTorus](./rectangulartorus) | Toro rettangolare parametrizzato. |
| [RevolvedAreaSolid](./revolvedareasolid) | Questa classe rappresenta un modello solido ruotando una sezione trasversale fornita da un profilo attorno ad un asse. |
| [Shape](./shape) | La forma descrive la deformazione su un insieme di punti di controllo, che è simile al deformatore a grappolo in Maya. Ad esempio, possiamo aggiungere una forma a una geometria creata. E la forma e la geometria hanno le stesse informazioni topologiche ma diversa posizione dei punti di controllo. Con livelli di influenza variabili, la geometria esegue un effetto di deformazione. |
| [Skeleton](./skeleton) | Il[`Skeleton`](../aspose.threed.entities/skeleton)viene utilizzato principalmente dal software CAD per aiutare il progettista a manipolare la trasformazione della struttura scheletrica, di solito è inutile al di fuori dei software CAD. Per fare in modo che la gerarchia dello scheletro agisca come un oggetto nel software CAD, è necessario contrassegnare la parte superiore[`Skeleton`](../aspose.threed.entities/skeleton) nodo come quello principale impostando[`Type`](../aspose.threed.entities/skeleton/type) aSkeleton , e tutti i bambini impostati suBone |
| [Sphere](./sphere) | Sfera parametrizzata. |
| [SweptAreaSolid](./sweptareasolid) | A[`SweptAreaSolid`](../aspose.threed.entities/sweptareasolid) costruisce una geometria facendo scorrere un profilo lungo una direttrice. |
| [Torus](./torus) | Toro parametrizzato. |
| [TransformedCurve](./transformedcurve) | A[`TransformedCurve`](../aspose.threed.entities/transformedcurve) fornisce un posizionamento a una curva utilizzando una matrice di trasformazione. Ciò consente di eseguire una trasformazione all'interno di a[`TrimmedCurve`](../aspose.threed.entities/trimmedcurve) o[`CompositeCurve`](../aspose.threed.entities/compositecurve) . |
| [TriMesh](./trimesh) | Un TriMesh contiene dati grezzi che possono essere utilizzati direttamente dalla GPU. Questa classe è un'utilità per aiutare a costruire una mesh che contiene solo dati per vertice. |
| [TriMesh&lt;T&gt;](./trimesh-1) | Versione generica di[`TriMesh`](../aspose.threed.entities/trimesh) per il vertice statico definito dall'utente type |
| [TrimmedCurve](./trimmedcurve) | Una curva limitata che ha tagliato la curva di base a entrambe le estremità. |
| [VertexElement](./vertexelement) | Classe base di elementi vertice. Un tipo di elemento vertice è identificato da VertexElementType. Un VertexElement descrive come l'elemento vertice è mappato su una superficie geometrica e come le informazioni di mappatura sono disposte in memoria. Un VertexElement contiene Normali, UV o altri tipi di informazioni. |
| [VertexElementBinormal](./vertexelementbinormal) | Definisce i vettori binormali per i componenti specificati. |
| [VertexElementDoublesTemplate](./vertexelementdoublestemplate) | Una classe di supporto per la definizione di calcestruzzo[`VertexElement`](../aspose.threed.entities/vertexelement) implementazioni. |
| [VertexElementEdgeCrease](./vertexelementedgecrease) | Definisce la piega del bordo per i componenti specificati |
| [VertexElementHole](./vertexelementhole) | Definisce se il poligono specificato è foro |
| [VertexElementIntsTemplate](./vertexelementintstemplate) | Una classe di supporto per la definizione di calcestruzzo[`VertexElement`](../aspose.threed.entities/vertexelement) implementazioni. |
| [VertexElementMaterial](./vertexelementmaterial) | Definisce l'indice del materiale per i componenti specificati. Un nodo può avere più materiali, il[`VertexElementMaterial`](../aspose.threed.entities/vertexelementmaterial) viene utilizzato per eseguire il rendering di parti diverse della geometria in materiali diversi. |
| [VertexElementNormal](./vertexelementnormal) | Definisce i vettori normali per i componenti specificati. |
| [VertexElementPolygonGroup](./vertexelementpolygongroup) | Definisce il gruppo di poligoni per i componenti specificati per raggruppare i poligoni correlati. |
| [VertexElementSmoothingGroup](./vertexelementsmoothinggroup) | Un gruppo di levigatura è un gruppo di poligoni in una mesh poligonale che dovrebbe sembrare formare una superficie liscia. Alcuni dei primi software di modellazione 3d come 3D studio max per DOS utilizzavano il gruppo di levigatura per annullare la memorizzazione del vettore normale per ciascun vertice della mesh. |
| [VertexElementSpecular](./vertexelementspecular) | Definisce il colore speculare per i componenti specificati. |
| [VertexElementTangent](./vertexelementtangent) | Definisce i vettori tangenti per i componenti specificati. |
| [VertexElementTemplate&lt;T&gt;](./vertexelementtemplate-1) | Una classe di supporto per la definizione di calcestruzzo[`VertexElement`](../aspose.threed.entities/vertexelement) implementazioni. |
| [VertexElementUserData](./vertexelementuserdata) | Definisce i dati utente personalizzati per i componenti specificati. Di solito si tratta di dati specifici dell'applicazione per scopi speciali. |
| [VertexElementUV](./vertexelementuv) | Definisce le coordinate UV per i componenti specificati. Una geometria può avere più[`VertexElementUV`](../aspose.threed.entities/vertexelementuv) elementi, e ognuno ha diversi[`TextureMapping`](../aspose.threed.entities/texturemapping) s. |
| [VertexElementVector4](./vertexelementvector4) | Una classe di supporto per la definizione di calcestruzzo[`VertexElement`](../aspose.threed.entities/vertexelement) implementazioni. |
| [VertexElementVertexColor](./vertexelementvertexcolor) | Definisce il colore del vertice per i componenti specificati |
| [VertexElementVertexCrease](./vertexelementvertexcrease) | Definisce la piega del vertice per i componenti specificati |
| [VertexElementVisibility](./vertexelementvisibility) | Definisce se i componenti specificati sono visibili |
| [VertexElementWeight](./vertexelementweight) | Definisce il peso della fusione per i componenti specificati. |
## Interfacce

| Interfaccia | Descrizione |
| --- | --- |
| [IIndexedVertexElement](./iindexedvertexelement) | VertexElement con dati di indici. |
| [IMeshConvertible](./imeshconvertible) | Entità che hanno implementato questa interfaccia possono essere convertite in[`Mesh`](../aspose.threed.entities/mesh) |
| [IOrientable](./iorientable) | Le entità orientabili implementeranno questa interfaccia. |
## Enumerazione

| Enumerazione | Descrizione |
| --- | --- |
| [ApertureMode](./aperturemode) | Modalità di apertura della fotocamera. La modalità di apertura determina quali valori guidano l'apertura della fotocamera. Se la modalità di apertura è OrizAndVert, Orizzontale o Verticale, viene utilizzato il campo visivo. Se la modalità di apertura è FocalLength, viene utilizzata la lunghezza focale. |
| [CurveDimension](./curvedimension) | La dimensione delle curve. |
| [LightType](./lighttype) | Tipi di luce. |
| [MappingMode](./mappingmode) | Determina in che modo l'elemento viene mappato su una superficie. Il[`MappingMode`](../aspose.threed.entities/mappingmode) definito come[`VertexElement`](../aspose.threed.entities/vertexelement) è mappato sulla superficie della geometria. |
| [NurbsType](./nurbstype) | tipi NURBS. |
| [PatchDirectionType](./patchdirectiontype) | Tipi di direzione patch. |
| [ProjectionType](./projectiontype) | Tipi di proiezione della fotocamera. |
| [ReferenceMode](./referencemode) | [`ReferenceMode`](../aspose.threed.entities/referencemode) definisce come le informazioni di mappatura vengono memorizzate e referenziate da. |
| [RotationMode](./rotationmode) | La modalità di rotazione del tronco |
| [SkeletonType](./skeletontype) | [`Skeleton`](../aspose.threed.entities/skeleton) s tipi. |
| [SplitMeshPolicy](./splitmeshpolicy) | Condividi i dati dei vertici/punti di controllo tra le sottomesh o ogni sottorete ha i propri dati compattati. |
| [TextureMapping](./texturemapping) | Il tipo di mappatura delle texture per[`VertexElementUV`](../aspose.threed.entities/vertexelementuv) Descrive il tipo di mappatura delle texture utilizzata. |
| [VertexElementType](./vertexelementtype) | Il tipo dell'elemento vertice, definito come verrà utilizzato nella modellazione. |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
