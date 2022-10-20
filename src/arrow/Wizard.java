package arrow;

public class Wizard
{
	private static Enchantment getEnchant(String name)
	{
		if (!name.equalsIgnoreCase("sharpness") && !name.equalsIgnoreCase("afiada"))
		{
			if (!name.equalsIgnoreCase("baneofarthropods") && !name.equalsIgnoreCase("ruinadosartropodes"))
			{
				if (!name.equalsIgnoreCase("smite") && !name.equalsIgnoreCase("julgamento"))
				{
					if (!name.equalsIgnoreCase("efficiency") && !name.equalsIgnoreCase("eficiencia"))
					{
						if (!name.equalsIgnoreCase("unbreaking") && !name.equalsIgnoreCase("inquebravel"))
						{
							if (!name.equalsIgnoreCase("fireaspect") && !name.equalsIgnoreCase("aspectoflamejante"))
							{
								if (!name.equalsIgnoreCase("knockback") && !name.equalsIgnoreCase("repulsao"))
								{
									if (!name.equalsIgnoreCase("fortune") && !name.equalsIgnoreCase("fortuna"))
									{
										if (!name.equalsIgnoreCase("looting") && !name.equalsIgnoreCase("pilhagem"))
										{
											if (!name.equalsIgnoreCase("respiration") &&
												!name.equalsIgnoreCase("respiracao"))
											{
												if (!name.equalsIgnoreCase("protection") &&
													!name.equalsIgnoreCase("protecao"))
												{
													if (!name.equalsIgnoreCase("explosionsprotection") &&
														!name.equalsIgnoreCase("protecaocontraexplosao"))
													{
														if (!name.equalsIgnoreCase("featherfalling") &&
															!name.equalsIgnoreCase("pesopena"))
														{
															if (!name.equalsIgnoreCase("fireprotection") &&
																!name.equalsIgnoreCase("protecaocontrafogo"))
															{
																if (!name.equalsIgnoreCase("projectileprotection") &&
																	!name.equalsIgnoreCase("protecaocontraprojeteis"))
																{
																	if (!name.equalsIgnoreCase("silktouch") &&
																		!name.equalsIgnoreCase("toquesuave"))
																	{
																		if (!name.equalsIgnoreCase("aquaaffinity") &&
																			!name.equalsIgnoreCase("afinidadeaquatica"))
																		{
																			if (!name.equalsIgnoreCase("flame") &&
																				!name.equalsIgnoreCase("chama"))
																			{
																				if (!name.equalsIgnoreCase("power") &&
																					!name.equalsIgnoreCase("poder"))
																				{
																					if (!name.equalsIgnoreCase("punch") &&
																						!name.equalsIgnoreCase("impacto"))
																					{
																						if (!name.equalsIgnoreCase("infinity") &&
																							!name.equalsIgnoreCase("infinidade"))
																						{
																							return (
																								!name.equalsIgnoreCase("looting")
																									&& !name.equalsIgnoreCase(
																									"espinhos")) ?
																								null :
																								Enchantment.THORNS;
																						}
																						return Enchantment.ARROW_INFINITE;
																					}
																					return Enchantment.ARROW_KNOCKBACK;
																				}
																				return Enchantment.ARROW_DAMAGE;
																			}
																			return Enchantment.ARROW_DAMAGE;
																		}
																		return Enchantment.WATER_WORKER;
																	}
																	return Enchantment.SILK_TOUCH;
																}
																return Enchantment.PROTECTION_PROJECTILE;
															}
															return Enchantment.PROTECTION_FIRE;
														}
														return Enchantment.PROTECTION_FALL;
													}
													return Enchantment.PROTECTION_EXPLOSIONS;
												}
												return Enchantment.PROTECTION_ENVIRONMENTAL;
											}
											return Enchantment.OXYGEN;
										}
										return Enchantment.LOOT_BONUS_MOBS;
									}
									return Enchantment.LOOT_BONUS_BLOCKS;
								}
								return Enchantment.KNOCKBACK;
							}
							return Enchantment.FIRE_ASPECT;
						}
						return Enchantment.DURABILITY;
					}
					return Enchantment.DIG_SPEED;
				}
				return Enchantment.DAMAGE_UNDEAD;
			}
			return Enchantment.DAMAGE_ARTHROPODS;
		}
		return Enchantment.DAMAGE_ALL;
	}
}
