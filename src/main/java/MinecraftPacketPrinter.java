import com.nukkitx.protocol.bedrock.BedrockPacket;

public class MinecraftPacketPrinter {
  private int receivedPacketNumber = 0;

  public void printReceived(BedrockPacket packet) {
    switch (packet.getPacketType()) {
      case TEXT:
      case DISCONNECT:
      case PLAY_STATUS:
        System.out.println("Received packet " + receivedPacketNumber + ": " + packet);
      case ADD_BEHAVIOR_TREE:
      case ADD_ENTITY:
      case ADD_HANGING_ENTITY:
      case ADD_ITEM_ENTITY:
      case ADD_PAINTING:
      case ADD_PLAYER:
      case ADVENTURE_SETTINGS:
      case ANIMATE:
      case ANVIL_DAMAGE:
      case AUTOMATION_CLIENT_CONNECT:
      case AVAILABLE_COMMANDS:
      case AVAILABLE_ENTITY_IDENTIFIERS:
      case BIOME_DEFINITIONS_LIST:
      case BLOCK_ENTITY_DATA:
      case BLOCK_EVENT:
      case BLOCK_PICK_REQUEST:
      case BOOK_EDIT:
      case BOSS_EVENT:
      case CAMERA:
      case CHANGE_DIMENSION:
      case CHUNK_RADIUS_UPDATED:
      case CLIENTBOUND_MAP_ITEM_DATA:
      case CLIENT_CACHE_BLOB_STATUS:
      case CLIENT_CACHE_MISS_RESPONSE:
      case CLIENT_CACHE_STATUS:
      case CLIENT_TO_SERVER_HANDSHAKE:
      case COMMAND_BLOCK_UPDATE:
      case COMMAND_OUTPUT:
      case COMMAND_REQUEST:
      case COMPLETED_USING_ITEM:
      case CONTAINER_CLOSE:
      case CONTAINER_OPEN:
      case CONTAINER_SET_DATA:
      case CRAFTING_DATA:
      case CRAFTING_EVENT:
        //      case DISCONNECT:
      case EDUCATION_SETTINGS:
      case EMOTE:
      case ENTITY_EVENT:
      case ENTITY_FALL:
      case ENTITY_PICK_REQUEST:
      case EVENT:
      case EXPLODE:
      case GAME_RULES_CHANGED:
      case GUI_DATA_PICK_ITEM:
      case HURT_ARMOR:
      case INTERACT:
      case INVENTORY_CONTENT:
      case INVENTORY_SLOT:
      case INVENTORY_TRANSACTION:
      case ITEM_FRAME_DROP_ITEM:
      case LAB_TABLE:
      case LECTERN_UPDATE:
      case LEVEL_CHUNK:
      case LEVEL_EVENT_GENERIC:
      case LEVEL_EVENT:
      case LEVEL_SOUND_EVENT:
      case LEVEL_SOUND_EVENT_2:
      case LEVEL_SOUND_EVENT_3:
      case LOGIN:
      case MAP_CREATE_LOCKED_COPY:
      case MAP_INFO_REQUEST:
      case MOB_ARMOR_EQUIPMENT:
      case MOB_EFFECT:
      case MOB_EQUIPMENT:
      case MODAL_FORM_REQUEST:
      case MODAL_FORM_RESPONSE:
      case MOVE_ENTITY_ABSOLUTE:
      case MOVE_ENTITY_DELTA:
      case MOVE_PLAYER:
      case MULTIPLAYER_SETTINGS:
      case NETWORK_CHUNK_PUBLISHER_UPDATE:
      case NETWORK_SETTINGS:
      case NETWORK_STACK_LATENCY:
      case NPC_REQUEST:
      case ON_SCREEN_TEXTURE_ANIMATION:
      case PHOTO_TRANSFER:
      case PLAYER_ACTION:
      case PLAYER_AUTH_INPUT:
      case PLAYER_HOTBAR:
      case PLAYER_INPUT:
      case PLAYER_LIST:
      case PLAYER_SKIN:
      case PLAY_SOUND:
        //      case PLAY_STATUS:
      case PURCHASE_RECEIPT:
      case REMOVE_ENTITY:
      case REMOVE_OBJECTIVE:
      case REQUEST_CHUNK_RADIUS:
      case RESOURCE_PACK_CHUNK_DATA:
      case RESOURCE_PACK_CHUNK_REQUEST:
      case RESOURCE_PACK_CLIENT_RESPONSE:
      case RESOURCE_PACK_DATA_INFO:
      case RESOURCE_PACKS_INFO:
      case RESOURCE_PACK_STACK:
      case RESPAWN:
      case RIDER_JUMP:
      case SCRIPT_CUSTOM_EVENT:
      case SERVER_SETTINGS_REQUEST:
      case SERVER_SETTINGS_RESPONSE:
      case SERVER_TO_CLIENT_HANDSHAKE:
      case SET_COMMANDS_ENABLED:
      case SET_DEFAULT_GAME_TYPE:
      case SET_DIFFICULTY:
      case SET_DISPLAY_OBJECTIVE:
      case SET_ENTITY_DATA:
      case SET_ENTITY_LINK:
      case SET_ENTITY_MOTION:
      case SET_HEALTH:
      case SET_LAST_HURT_BY:
      case SET_LOCAL_PLAYER_AS_INITIALIZED:
      case SET_PLAYER_GAME_TYPE:
      case SET_SCOREBOARD_IDENTITY:
      case SET_SCORE:
      case SET_SPAWN_POSITION:
      case SET_TIME:
      case SETTINGS_COMMAND:
      case SET_TITLE:
      case SHOW_CREDITS:
      case SHOW_PROFILE:
      case SHOW_STORE_OFFER:
      case SIMPLE_EVENT:
      case SPAWN_EXPERIENCE_ORB:
      case SPAWN_PARTICLE_EFFECT:
      case START_GAME_PACKET:
      case STOP_SOUND_PACKET:
      case STRUCTURE_BLOCK_UPDATE:
      case STRUCTURE_TEMPLATE_DATA_EXPORT_REQUEST:
      case STRUCTURE_TEMPLATE_DATA_EXPORT_RESPONSE:
      case SUB_CLIENT_LOGIN:
      case TAKE_ITEM_ENTITY:
      case TICK_SYNC:
      case TRANSFER:
      case UNKNOWN:
      case UPDATE_ATTRIBUTES:
      case UPDATE_BLOCK:
      case UPDATE_BLOCK_PROPERTIES:
      case UPDATE_BLOCK_SYNCED:
      case UPDATE_EQUIP:
      case UPDATE_SOFT_ENUM:
      case UPDATE_TRADE:
      case VIDEO_STREAM_CONNECT:
    }

    receivedPacketNumber++;
  }
}