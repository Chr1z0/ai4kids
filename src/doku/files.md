# Files
> https://docs.minecraftforge.net/en/latest/

## *FirstMod*
* Hauptklasse für Mod
* initialisiert Mod, registriert Ereignisse und implementiert Funktionen für Mod
* `@Mod(FirstMod.MOD_ID)`: Mod-ID, wird in **mods.toml** verwendet
* `commonSetup`: wird beim Laden des Mod ausgeführt, set up
* `addCreative`: fügt das Item zum Creative-Menue hinzu
* `onServerStarting`: wird aufgerufen, wenn Server startet
* `ClientModEvents`: innere statische Klasse, welche Events für Client behandelt

## *ClientModEvents*
* Klasse innerhalb ``FirstMod`` 
* behandelt Client spezifische Ereignisse - in Forge können Ereignisse auf Client und Server unterschiedlich sein
* ``onClientSetup``: wird aufgerufen, wenn Ereignis `FMLClientSetupEvent` ausgelöst wird
  * meist, wenn client geladen wird und spez. Einstellungen für Mod vorgenommen werden müssen
* ``@SubscribeEvent``: Methoden mit dieser Annotation werden aufgerufen, wenn Event ausgelöst wird
* ``@Mod.EventBusSubscriber``: alle statischen Methoden dieser Klasse werden automatisch registriert, wenn Annotation `@SubscribeEvent` vorhanden 


## *ModItems*
* Klasse welche Items registriert und verwaltet
* ``Items``: ein **DeferredRegister** also eine Liste von Items welche registriert werden
  * Deferred Register Datentyp registriert neue Items erst, wenn alle anderen Daten geladen sind
* ``ITEMS.register``: registriert ein Item des **DeferredRegister** 
* ``ITEMS.register("sapphire",
  () -> new Item(new Item.Properties()))``: Supplier mit Lambda-Funktion
  * erzeugt neue Instanz der Klasse ``Item`` mit Standardeigenschaften (`Properties`), welche später noch angepasst werden können

## *en_us.json*
* Erstellung der Ingame-Namen (en) aus den Bezeichnern 

## *raw_sapphire.json / sapphire.json*
* ``"parent": "item/generated"``: Model basiert auf generischen Modell für Items (von Forge bereitgestellt, erstellt einfaches 2D Modell des Items)
* ``textures": {...}``: Texturen welche vom Modell verwendet werden
* ``"layer0": "firstmod:item/sapphire"``: legt Textur für Item fest 
* wenn man **layer0** und **layer1** usw. verwendet, werden verschiedene Schichten von Texturen für Item kombiniert