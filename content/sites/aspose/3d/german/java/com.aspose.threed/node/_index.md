---
title: Node
second_title: Aspose.3D für Java API-Referenz
description: Stellt ein Element im Szenengraphen dar.
type: docs
weight: 110
url: /de/java/com.aspose.threed/node/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject)
```
public class Node extends SceneObject
```

Stellt ein Element im Szenengraphen dar. Ein Szenengraph ist ein Baum von Node-Objekten. Die Baumverwaltungsdienste sind in dieser Klasse enthalten. Hinweis: Das Aspose.3D SDK prüft nicht die Gültigkeit des konstruierten Szenengraphen. Es liegt in der Verantwortung des Aufrufers sicherzustellen, dass keine zyklischen Graphen in einer Node-Hierarchie erzeugt werden. Neben der Baumverwaltung definiert diese Klasse alle Eigenschaften, die zur Beschreibung der Position des Objekts in der Szene erforderlich sind. Diese Informationen umfassen die grundlegenden Eigenschaften Translation, Rotation und Skalierung sowie weiterführende Optionen für Drehpunkte, Grenzen und IK-Gelenkattribute wie Steifigkeit und Dämpfung. Beim ersten Erstellen ist das Node-Objekt "empty" (d. h.: es ist ein Objekt ohne grafische Darstellung, das nur Positionsinformationen enthält). In diesem Zustand kann es verwendet werden, um Eltern im Node-Baum darzustellen, jedoch nicht viel mehr. Die übliche Verwendung dieser Art von Objekten besteht darin, ihnen eine Entität hinzuzufügen, die den Node spezialisieren wird (siehe "Entity"). Die Entität ist ein eigenständiges Objekt und ist mit dem Node verbunden. Das bedeutet auch, dass dieselbe Entität von mehreren Nodes gemeinsam genutzt werden kann. Kamera, Licht, Mesh usw. sind alle Entitäten und sie alle leiten sich von der Basisklasse Entity ab.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [Node()](#Node--) | Initialisiert eine neue Instanz der [Node](../../com.aspose.threed/node)-Klasse. |
| [Node(String name, Entity entity)](#Node-java.lang.String-com.aspose.threed.Entity-) | Initialisiert eine neue Instanz der [Node](../../com.aspose.threed/node)-Klasse. |
| [Node(String name)](#Node-java.lang.String-) | Initialisiert eine neue Instanz der [Node](../../com.aspose.threed/node)-Klasse. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [accept(NodeVisitor visitor)](#accept-com.aspose.threed.NodeVisitor-) | Durchläuft alle Nachfolger-Nodes (einschließlich des aktuellen Nodes) und ruft den Besucher mit dem Node auf. |
| [addChildNode(Node node)](#addChildNode-com.aspose.threed.Node-) | Füge diesem Node einen Kind-Node hinzu |
| [addEntity(Entity entity)](#addEntity-com.aspose.threed.Entity-) | Füge dem Node eine Entität hinzu |
| [createChildNode()](#createChildNode--) | Erstellt einen Kindknoten |
| [createChildNode(Entity entity)](#createChildNode-com.aspose.threed.Entity-) | Erstelle einen neuen Kindknoten mit angehängter gegebener Entität |
| [createChildNode(String nodeName)](#createChildNode-java.lang.String-) | Erstelle einen neuen Kindknoten mit dem angegebenen Knotennamen |
| [createChildNode(String nodeName, Entity entity)](#createChildNode-java.lang.String-com.aspose.threed.Entity-) | Erstelle einen neuen Kindknoten mit dem angegebenen Knotennamen |
| [createChildNode(String nodeName, Entity entity, Material material)](#createChildNode-java.lang.String-com.aspose.threed.Entity-com.aspose.threed.Material-) | Erstelle einen neuen Kindknoten mit dem angegebenen Knotennamen und hänge die angegebene Entität sowie ein Material an |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [evaluateGlobalTransform(boolean withGeometricTransform)](#evaluateGlobalTransform-boolean-) | Bewerte die globale Transformation, die geometrische Transformation einbeziehen oder nicht. |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Findet die Eigenschaft. |
| [getAssetInfo()](#getAssetInfo--) | Asset-Informationen pro Knoten |
| [getBoundingBox()](#getBoundingBox--) | Berechne die Begrenzungsbox des Knotens |
| [getChild(int index)](#getChild-int-) | Gibt den Kindknoten am angegebenen Index zurück. |
| [getChild(String nodeName)](#getChild-java.lang.String-) | Gibt den Kindknoten mit dem angegebenen Namen zurück. |
| [getChildNodes()](#getChildNodes--) | Gibt die Kindknoten zurück. |
| [getClass()](#getClass--) |  |
| [getEntities()](#getEntities--) | Gibt alle Knotenentitäten zurück. |
| [getEntity()](#getEntity--) | Gibt die erste an diesen Knoten angehängte Entität zurück; wenn gesetzt, werden andere Entitäten gelöscht. |
| [getExcluded()](#getExcluded--) | Gibt an, ob dieser Knoten und alle Kindknoten/Entitäten beim Exportieren ausgeschlossen werden sollen. |
| [getGlobalTransform()](#getGlobalTransform--) | Gibt die globale Transformation zurück. |
| [getMaterial()](#getMaterial--) | Gibt das erste mit diesem Knoten verbundene Material zurück; wenn gesetzt, werden andere Materialien gelöscht. |
| [getMaterials()](#getMaterials--) | Gibt die mit diesem Knoten verbundenen Materialien zurück. |
| [getMetaDatas()](#getMetaDatas--) | Gibt die in diesem Knoten definierten Metadaten zurück. |
| [getName()](#getName--) | Liefert den Namen. |
| [getParentNode()](#getParentNode--) | Gibt den übergeordneten Knoten zurück. |
| [getProperties()](#getProperties--) | Liefert die Sammlung aller Eigenschaften. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Liefere den Wert der angegebenen Eigenschaft |
| [getScene()](#getScene--) | Liefert die Szene, zu der dieses Objekt gehört |
| [getTransform()](#getTransform--) | Gibt die lokale Transformation zurück. |
| [getVisible()](#getVisible--) | Gibt an, den Knoten anzuzeigen |
| [hashCode()](#hashCode--) |  |
| [merge(Node node)](#merge-com.aspose.threed.Node-) | Löst alles unter dem Knoten und hängt es am aktuellen Knoten an. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Entfernt eine dynamische Eigenschaft. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Entferne die angegebene Eigenschaft, die durch ihren Namen identifiziert wird |
| [selectObjects(String path)](#selectObjects-java.lang.String-) | Wähle mehrere Objekte unter dem aktuellen Knoten mit XPath-ähnlicher Abfragesyntax aus. |
| [selectSingleObject(String path)](#selectSingleObject-java.lang.String-) | Wähle ein einzelnes Objekt unter dem aktuellen Knoten mit XPath-ähnlicher Abfragesyntax aus. |
| [setAssetInfo(AssetInfo value)](#setAssetInfo-com.aspose.threed.AssetInfo-) | Asset-Informationen pro Knoten |
| [setEntity(Entity value)](#setEntity-com.aspose.threed.Entity-) | Setzt die erste an diesen Knoten angehängte Entität; wenn gesetzt, werden andere Entitäten gelöscht. |
| [setExcluded(boolean value)](#setExcluded-boolean-) | Legt fest, ob dieser Knoten und alle Kindknoten/Entitäten beim Exportieren ausgeschlossen werden sollen. |
| [setMaterial(Material value)](#setMaterial-com.aspose.threed.Material-) | Setzt das erste Material, das mit diesem Knoten verknüpft ist; wenn gesetzt, werden andere Materialien gelöscht. |
| [setName(String value)](#setName-java.lang.String-) | Setzt den Namen. |
| [setParentNode(Node value)](#setParentNode-com.aspose.threed.Node-) | Setzt den übergeordneten Knoten. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Setzt den Wert der angegebenen Eigenschaft |
| [setVisible(boolean value)](#setVisible-boolean-) | Legt fest, den Knoten anzuzeigen. |
| [toString()](#toString--) | Gibt die Zeichenkettenrepräsentation dieses Knotens zurück. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Node() {#Node--}
```
public Node()
```


Initialisiert eine neue Instanz der [Node](../../com.aspose.threed/node)-Klasse.

### Node(String name, Entity entity) {#Node-java.lang.String-com.aspose.threed.Entity-}
```
public Node(String name, Entity entity)
```


Initialisiert eine neue Instanz der [Node](../../com.aspose.threed/node)-Klasse.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String | Name. |
| entity | [Entity](../../com.aspose.threed/entity) | Standard-Entität. |

### Node(String name) {#Node-java.lang.String-}
```
public Node(String name)
```


Initialisiert eine neue Instanz der [Node](../../com.aspose.threed/node)-Klasse.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String | Name. |

### accept(NodeVisitor visitor) {#accept-com.aspose.threed.NodeVisitor-}
```
public boolean accept(NodeVisitor visitor)
```


Durchläuft alle Nachfolgerknoten (einschließlich des aktuellen Knotens) und ruft den Besucher mit dem Knoten auf. Der Besucher kann den Durchlauf abbrechen, indem er false zurückgibt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| visitor | [NodeVisitor](../../com.aspose.threed/nodevisitor) | Besucher-Callback, um den Knoten zu besuchen. |

**Returns:**
boolean - true bedeutet, dass der Besucher den Durchlauf unterbrochen hat. **Example:** Der folgende Code zeigt, wie man alle Meshes aus einer Szene erhält

```
Scene scene = Scene.fromFile("input.fbx");
     List<Mesh> meshes = new ArrayList<Mesh>();
     scene.getRootNode().accept(new NodeVisitor() {
         @Override
         public boolean call(Node node) {
             if(node.Entity instanceof Mesh)
                 meshes.add(((Mesh)node).getEntity());
             //continue searching
             return true;
         }
     });
```
### addChildNode(Node node) {#addChildNode-com.aspose.threed.Node-}
```
public void addChildNode(Node node)
```


Füge diesem Node einen Kind-Node hinzu

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
|  | node | [Node](../../com.aspose.threed/node) | Der anzuhängende Kindknoten **Example:** Der folgende Code zeigt, wie man alle Meshes aus einer Szene erhält |

```
Scene scene = Scene.fromFile("input.fbx");
     var newNode = new Node();
     //add a new node manually
     scene.getRootNode().addChildNode(newNode);
``` |

### addEntity(Entity entity) {#addEntity-com.aspose.threed.Entity-}
```
public void addEntity(Entity entity)
```


Füge dem Node eine Entität hinzu

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| entity | [Entity](../../com.aspose.threed/entity) | Die an den Knoten anzuhängende Entität |

### createChildNode() {#createChildNode--}
```
public Node createChildNode()
```


Erstellt einen Kindknoten

**Returns:**
[Node](../../com.aspose.threed/node) - The new child node. **Example:** The following code shows how to create a new child node under root node

```
Scene scene = new Scene();
     Node node = scene.getRootNode().createChildNode();
     node.setEntity(new Box());
     scene.save("output.fbx");
```
### createChildNode(Entity entity) {#createChildNode-com.aspose.threed.Entity-}
```
public Node createChildNode(Entity entity)
```


Erstelle einen neuen Kindknoten mit angehängter gegebener Entität

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| entity | [Entity](../../com.aspose.threed/entity) | Standard-Entität, die an den Knoten angehängt ist |

**Returns:**
[Node](../../com.aspose.threed/node) - The new child node. **Example:** The following code shows how to create a new child node under root node

```
Scene scene = new Scene();
     Node node = scene.getRootNode().createChildNode(new Box());
     scene.save("output.fbx");
```
### createChildNode(String nodeName) {#createChildNode-java.lang.String-}
```
public Node createChildNode(String nodeName)
```


Erstelle einen neuen Kindknoten mit dem angegebenen Knotennamen

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| nodeName | java.lang.String | Der Name des neuen Kindknotens |

**Returns:**
[Node](../../com.aspose.threed/node) - The new child node. **Example:** The following code shows how to create a new child node under root node

```
Scene scene = new Scene();
     Node node = scene.getRootNode().createChildNode("new node");
     node.setEntity(new Box());
     scene.save("output.fbx");
```
### createChildNode(String nodeName, Entity entity) {#createChildNode-java.lang.String-com.aspose.threed.Entity-}
```
public Node createChildNode(String nodeName, Entity entity)
```


Erstelle einen neuen Kindknoten mit dem angegebenen Knotennamen

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| nodeName | java.lang.String | Der Name des neuen Kindknotens |
| entity | [Entity](../../com.aspose.threed/entity) | Standard-Entität, die an den Knoten angehängt ist |

**Returns:**
[Node](../../com.aspose.threed/node) - The new child node.
### createChildNode(String nodeName, Entity entity, Material material) {#createChildNode-java.lang.String-com.aspose.threed.Entity-com.aspose.threed.Material-}
```
public Node createChildNode(String nodeName, Entity entity, Material material)
```


Erstelle einen neuen Kindknoten mit dem angegebenen Knotennamen und hänge die angegebene Entität sowie ein Material an

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| nodeName | java.lang.String | Der Name des neuen Kindknotens |
| entity | [Entity](../../com.aspose.threed/entity) | Standard-Entität, die an den Knoten angehängt ist |
| material | [Material](../../com.aspose.threed/material) | Das an den Knoten angehängte Material |

**Returns:**
[Node](../../com.aspose.threed/node) - The new child node.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### evaluateGlobalTransform(boolean withGeometricTransform) {#evaluateGlobalTransform-boolean-}
```
public Matrix4 evaluateGlobalTransform(boolean withGeometricTransform)
```


Bewerte die globale Transformation, die geometrische Transformation einbeziehen oder nicht.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| withGeometricTransform | boolean | Ob die geometrische Transformation benötigt wird. |

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4) - The global transform matrix. **Example:** The following code shows how to read the node's global transform matrix.

```
Scene scene = new Scene();
     var boxNode = scene.getRootNode().createChildNode(new Box());
     //place the box at (10, 0, 0)
     boxNode.getTransform().setTranslation(new Vector3(10, 0, 0));
     Matrix4 mat = boxNode.evaluateGlobalTransform(true);
     System.out.printf("The box's global transform matrix is %s", mat);
```
### findProperty(String propertyName) {#findProperty-java.lang.String-}
```
public Property findProperty(String propertyName)
```


Findet die Eigenschaft. Sie kann eine dynamische Eigenschaft sein (erstellt durch CreateDynamicProperty/SetProperty) oder eine native Eigenschaft (identifiziert durch ihren Namen)

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| propertyName | java.lang.String | Eigenschaftsname. |

**Returns:**
[Property](../../com.aspose.threed/property) - The property.
### getAssetInfo() {#getAssetInfo--}
```
public AssetInfo getAssetInfo()
```


Asset-Informationen pro Knoten

**Returns:**
[AssetInfo](../../com.aspose.threed/assetinfo) - Per-node asset info
### getBoundingBox() {#getBoundingBox--}
```
public BoundingBox getBoundingBox()
```


Berechne die Begrenzungsbox des Knotens

**Returns:**
[BoundingBox](../../com.aspose.threed/boundingbox) - The bounding box of current node
### getChild(int index) {#getChild-int-}
```
public Node getChild(int index)
```


Gibt den Kindknoten am angegebenen Index zurück.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int | Index. |

**Returns:**
[Node](../../com.aspose.threed/node) - The child. **Example:** The following code shows how to get a child node at specified index.

```
Scene scene = Scene.fromFile("input.fbx");
     var node = scene.getRootNode().getChild(0);
     System.out.printf("The first node of the file is %s", node.getName());
```
### getChild(String nodeName) {#getChild-java.lang.String-}
```
public Node getChild(String nodeName)
```


Gibt den Kindknoten mit dem angegebenen Namen zurück.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| nodeName | java.lang.String | Der zu findende Kindname. |

**Returns:**
[Node](../../com.aspose.threed/node) - The child. **Example:** The following code shows how to get a child node with specified name

```
Scene scene = Scene.fromFile("input.fbx");
     var node = scene.getRootNode().getChild("box");
     System.out.printf("The box node's translation is %s", node.getTransform().getTranslation());
```
### getChildNodes() {#getChildNodes--}
```
public List<Node> getChildNodes()
```


Gibt die Kindknoten zurück.

**Returns:**
java.util.List<com.aspose.threed.Node> - die Kindknoten. **Example:** Der folgende Code zeigt, wie man Kindknoten des Wurzelknotens aufzählt

```
Scene scene = Scene.fromFile("test.fbx");
     for(var child : scene.getRootNode().getChildNodes())
     {
         //do your business
     }
```
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getEntities() {#getEntities--}
```
public List<Entity> getEntities()
```


Gibt alle Knotenentitäten zurück.

**Returns:**
java.util.List<com.aspose.threed.Entity> - alle Knoten-Entitäten.
### getEntity() {#getEntity--}
```
public Entity getEntity()
```


Gibt die erste an diesen Knoten angehängte Entität zurück; wenn gesetzt, werden andere Entitäten gelöscht.

**Returns:**
[Entity](../../com.aspose.threed/entity) - the first entity attached to this node, if sets, will clear other entities. **Example:** The following code shows how to create a new child node under root node

```
Scene scene = new Scene();
     Node node = scene.getRootNode().createChildNode("new node");
     node.setEntity(new Box());
     scene.save("output.fbx");
```
### getExcluded() {#getExcluded--}
```
public boolean getExcluded()
```


Gibt an, ob dieser Knoten und alle Kindknoten/Entitäten beim Exportieren ausgeschlossen werden sollen.

**Returns:**
boolean - ob dieser Knoten und alle Kindknoten/Entitäten beim Exportieren ausgeschlossen werden sollen. **Example:** Der folgende Code zeigt, wie man einen angegebenen Knoten vom Export ausschließt

```
Scene scene = new Scene();
     scene.getRootNode().createChildNode("excluded", new Box()).setExcluded(true);
     scene.getRootNode().createChildNode("not excluded", new Box());
     scene.save("output.usdz");
```
### getGlobalTransform() {#getGlobalTransform--}
```
public GlobalTransform getGlobalTransform()
```


Gibt die globale Transformation zurück.

**Returns:**
[GlobalTransform](../../com.aspose.threed/globaltransform) - the global transform. **Example:** The following code shows how to read node's global transform

```
Scene scene = new Scene();
     var boxNode = scene.getRootNode().createChildNode(new Box());
     //place the box at (10, 0, 0)
     boxNode.getTransform().setTranslation(new Vector3(10, 0, 0));
     var global = boxNode.getGlobalTransform();
     System.out.printf("The box's position in world coordinate is %s", global.getTranslation());
```
### getMaterial() {#getMaterial--}
```
public Material getMaterial()
```


Gibt das erste mit diesem Knoten verbundene Material zurück; wenn gesetzt, werden andere Materialien gelöscht.

**Returns:**
[Material](../../com.aspose.threed/material) - the first material associated with this node, if sets, will clear other materials **Example:**

```
Scene scene = new Scene();
     var node = scene.getRootNode().createChildNode(new Box());
     node.setMaterial(new LambertMaterial());
```
### getMaterials() {#getMaterials--}
```
public List<Material> getMaterials()
```


Gibt die mit diesem Knoten verbundenen Materialien zurück.

**Returns:**
java.util.List<com.aspose.threed.Material> - die mit diesem Knoten verknüpften Materialien.
### getMetaDatas() {#getMetaDatas--}
```
public List<CustomObject> getMetaDatas()
```


Gibt die in diesem Knoten definierten Metadaten zurück.

**Returns:**
java.util.List<com.aspose.threed.CustomObject> - die in diesem Knoten definierten Metadaten.
### getName() {#getName--}
```
public String getName()
```


Liefert den Namen.

**Returns:**
java.lang.String - der Name.
### getParentNode() {#getParentNode--}
```
public Node getParentNode()
```


Gibt den übergeordneten Knoten zurück.

**Returns:**
[Node](../../com.aspose.threed/node) - the parent node.
### getProperties() {#getProperties--}
```
public PropertyCollection getProperties()
```


Liefert die Sammlung aller Eigenschaften.

**Returns:**
[PropertyCollection](../../com.aspose.threed/propertycollection) - the collection of all properties.
### getProperty(String property) {#getProperty-java.lang.String-}
```
public Object getProperty(String property)
```


Liefere den Wert der angegebenen Eigenschaft

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eigenschaft | java.lang.String | Eigenschaftsname |

**Returns:**
java.lang.Object - Der Wert der gefundenen Eigenschaft
### getScene() {#getScene--}
```
public Scene getScene()
```


Liefert die Szene, zu der dieses Objekt gehört

**Returns:**
[Scene](../../com.aspose.threed/scene) - the scene that this object belongs to
### getTransform() {#getTransform--}
```
public Transform getTransform()
```


Gibt die lokale Transformation zurück.

**Returns:**
[Transform](../../com.aspose.threed/transform) - the local transform. **Example:** The following code shows how to change the transform of the node:

```
Scene scene = new Scene();
     var boxNode = scene.getRootNode().createChildNode(new Box());
     //place the box at (10, 0, 0)
     boxNode.getTransform().setTranslation(new Vector3(10, 0, 0));
```
### getVisible() {#getVisible--}
```
public boolean getVisible()
```


Gibt an, den Knoten anzuzeigen

**Returns:**
boolean - zum Anzeigen des Knotens **Example:** Der folgende Code zeigt, wie man einen unsichtbaren Knoten erstellt

```
Scene scene = new Scene();
     Node node = scene.getRootNode().createChildNode("test-node", new Box());
     node.setVisible(false);
     scene.save("output.fbx");
```
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### merge(Node node) {#merge-com.aspose.threed.Node-}
```
public void merge(Node node)
```


Löst alles unter dem Knoten und hängt es an den aktuellen Knoten an. **Example:** Der folgende Code zeigt, wie man zwei 3D-Dateien zu einer Datei zusammenführt

```
Scene scene1 = Scene.fromFile("scene1.fbx");
     Scene scene2 = Scene.fromFile("scene2.fbx");
     scene1.getRootNode().merge(scene2.getRootNode());
     scene1.save("merged.fbx");
```

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| node | [Node](../../com.aspose.threed/node) |  |

### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### removeProperty(Property property) {#removeProperty-com.aspose.threed.Property-}
```
public boolean removeProperty(Property property)
```


Entfernt eine dynamische Eigenschaft.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| property | [Property](../../com.aspose.threed/property) | Welche Eigenschaft zu entfernen ist |

**Returns:**
boolean - true, wenn die Eigenschaft erfolgreich entfernt wurde
### removeProperty(String property) {#removeProperty-java.lang.String-}
```
public boolean removeProperty(String property)
```


Entferne die angegebene Eigenschaft, die durch ihren Namen identifiziert wird

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eigenschaft | java.lang.String | Welche Eigenschaft zu entfernen ist |

**Returns:**
boolean - true, wenn die Eigenschaft erfolgreich entfernt wurde
### selectObjects(String path) {#selectObjects-java.lang.String-}
```
public ArrayList<Object> selectObjects(String path)
```


Wähle mehrere Objekte unter dem aktuellen Knoten mit XPath-ähnlicher Abfragesyntax aus.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Pfad | java.lang.String | Die XPath-ähnliche Abfrage |

**Returns:**
java.util.ArrayList<java.lang.Object> - Mehrere Objekte entsprechen der XPath-ähnlichen Abfrage.
### selectSingleObject(String path) {#selectSingleObject-java.lang.String-}
```
public Object selectSingleObject(String path)
```


Wähle ein einzelnes Objekt unter dem aktuellen Knoten mit XPath-ähnlicher Abfragesyntax aus.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Pfad | java.lang.String | Die XPath-ähnliche Abfrage |

**Returns:**
java.lang.Object - Objekt, das durch die XPath-ähnliche Abfrage gefunden wurde.
### setAssetInfo(AssetInfo value) {#setAssetInfo-com.aspose.threed.AssetInfo-}
```
public void setAssetInfo(AssetInfo value)
```


Asset-Informationen pro Knoten

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [AssetInfo](../../com.aspose.threed/assetinfo) | Neuer Wert |

### setEntity(Entity value) {#setEntity-com.aspose.threed.Entity-}
```
public void setEntity(Entity value)
```


Setzt die erste an diesen Knoten angehängte Entität; wenn gesetzt, werden andere Entitäten gelöscht.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
|  | value | [Entity](../../com.aspose.threed/entity) | Neuer Wert **Beispiel:** Der folgende Code zeigt, wie man einen neuen Kindknoten unter dem Wurzelknoten erstellt |

```
Scene scene = new Scene();
     Node node = scene.getRootNode().createChildNode("new node");
     node.setEntity(new Box());
     scene.save("output.fbx");
``` |

### setExcluded(boolean value) {#setExcluded-boolean-}
```
public void setExcluded(boolean value)
```


Legt fest, ob dieser Knoten und alle Kindknoten/Entitäten beim Exportieren ausgeschlossen werden sollen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
|  | Wert | boolean | Neuer Wert **Beispiel:** Der folgende Code zeigt, wie man einen angegebenen Knoten vom Export ausschließt |

```
Scene scene = new Scene();
     scene.getRootNode().createChildNode("excluded", new Box()).setExcluded(true);
     scene.getRootNode().createChildNode("not excluded", new Box());
     scene.save("output.usdz");
``` |

### setMaterial(Material value) {#setMaterial-com.aspose.threed.Material-}
```
public void setMaterial(Material value)
```


Setzt das erste Material, das mit diesem Knoten verknüpft ist; wenn gesetzt, werden andere Materialien gelöscht.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
|  | value | [Material](../../com.aspose.threed/material) | Neuer Wert **Beispiel:** |

```
Scene scene = new Scene();
     var node = scene.getRootNode().createChildNode(new Box());
     node.setMaterial(new LambertMaterial());
``` |

### setName(String value) {#setName-java.lang.String-}
```
public void setName(String value)
```


Setzt den Namen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Neuer Wert |

### setParentNode(Node value) {#setParentNode-com.aspose.threed.Node-}
```
public void setParentNode(Node value)
```


Setzt den übergeordneten Knoten.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Node](../../com.aspose.threed/node) | Neuer Wert |

### setProperty(String property, Object value) {#setProperty-java.lang.String-java.lang.Object-}
```
public void setProperty(String property, Object value)
```


Setzt den Wert der angegebenen Eigenschaft

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Eigenschaft | java.lang.String | Eigenschaftsname |
| Wert | java.lang.Object | Der Wert der Eigenschaft |

### setVisible(boolean value) {#setVisible-boolean-}
```
public void setVisible(boolean value)
```


Legt fest, den Knoten anzuzeigen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
|  | Wert | boolean | Neuer Wert **Beispiel:** Der folgende Code zeigt, wie man einen unsichtbaren Knoten erstellt |

```
Scene scene = new Scene();
     Node node = scene.getRootNode().createChildNode("test-node", new Box());
     node.setVisible(false);
     scene.save("output.fbx");
``` |

### toString() {#toString--}
```
public String toString()
```


Gibt die Zeichenkettenrepräsentation dieses Knotens zurück.

**Returns:**
java.lang.String - Die String-Darstellung dieses Knotens für die Fehlersuche.
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final void wait(long arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

