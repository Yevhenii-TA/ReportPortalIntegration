package tests;

import base.GettingStatusCode;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestStatusCodes {

    @Test(dataProvider = "list_from")
    public void statusCodeTest(String url) {
        GettingStatusCode gettingStatusCode = new GettingStatusCode();
        int actualCode = gettingStatusCode.GetStatusCode(url);
        Assert.assertEquals(actualCode, 200, "Status code for" + url + " is not correct");
    }

    @DataProvider(name = "list_from")
    public Object[] getData1() {
        String[] data = {"https://airportparkingreservations.com/lot_honolulu_international_airport_hnl", "https://airportparkingreservations.com/lot_kahului_airport_standard_parking_company_ltd_ogg", "https://airportparkingreservations.com/lot_kona_international_airport_at_keahole_koa", "https://airportparkingreservations.com/lot_lihue_airport_lih", "https://airportparkingreservations.com/lot_oa_mckenzie_terminal_parking_cll", "https://airportparkingreservations.com/lot_pensacola_regional_airport_pns", "https://airportparkingreservations.com/lot_lvia_economy_parking_abe", "https://airportparkingreservations.com/lot_lvia_long_term_parking_abe", "https://airportparkingreservations.com/lot_lvia_short_term_parking_abe", "https://airportparkingreservations.com/lot_lvia_valet_parking_abe", "https://airportparkingreservations.com/lot_oa_ted_stevens_anchorage_international_anc", "https://airportparkingreservations.com/lot_best_western_plus_atl", "https://airportparkingreservations.com/lot_oa_hartsfield_jackson_airport_international_parking_atl", "https://airportparkingreservations.com/lot_oa_hartsfield_jackson_airport_north_parking_atl", "https://airportparkingreservations.com/lot_oa_hartsfield_jackson_airport_south_parking_atl", "https://airportparkingreservations.com/lot_ramada_plaza_atl", "https://airportparkingreservations.com/lot_oa_baltimore_washington_international_airport_garage_bwi", "https://airportparkingreservations.com/lot_oa_baton_rouge_airport_btr", "https://airportparkingreservations.com/lot_oa_bradley_international_airport_long_term_garage_bdl", "https://airportparkingreservations.com/lot_oa_birmingham_international_airport_long_term_parking_bhm", "https://airportparkingreservations.com/lot_oa_nashville_international_airport_bna", "https://airportparkingreservations.com/lot_oa_boise_airport_boi", "https://airportparkingreservations.com/lot_oa_boston_logan_international_airport_central_parking_garage_bos", "https://airportparkingreservations.com/lot_oa_boston_logan_international_airport_economy_parking_garage_bos", "https://airportparkingreservations.com/lot_oa_boston_logan_international_airport_terminal_a_parking_garage_bos", "https://airportparkingreservations.com/lot_oa_boston_logan_international_airport_terminal_b_parking_garage_bos", "https://airportparkingreservations.com/lot_oa_boston_logan_international_airport_terminal_c_parking_garage_bos", "https://airportparkingreservations.com/lot_oa_boston_logan_international_airport_terminal_e_garage_bos", "https://airportparkingreservations.com/lot_oa_buffalo_niagara_airport_preferred_long_term_buf", "https://airportparkingreservations.com/lot_oa_bob_hope_airport_bur", "https://airportparkingreservations.com/lot_oa_burlington_airport_general_parking_garage_btv", "https://airportparkingreservations.com/lot_oa_calgary_international_airports_parkade_yyc", "https://airportparkingreservations.com/lot_oa_charleston_international_airport_chs", "https://airportparkingreservations.com/lot_oa_yeager_airport_long_term_parking_crw", "https://airportparkingreservations.com/lot_oa_yeager_airport_short_term_parking_crw", "https://airportparkingreservations.com/lot_oa_ohare_airport_economy_lot_e_garage_ord", "https://airportparkingreservations.com/lot_oa_ohare_airport_economy_lot_f_ord", "https://airportparkingreservations.com/lot_oa_ohare_airport_economy_parking_ord", "https://airportparkingreservations.com/lot_oa_ohare_airport_main_garage_ord", "https://airportparkingreservations.com/lot_oa_ohare_airport_terminal_5_parking_ord", "https://airportparkingreservations.com/lot_oa_cincinnati_northern_kentucky_international_airport_cvg", "https://airportparkingreservations.com/lot_four_points_by_sheraton_cleveland_airport_cle", "https://airportparkingreservations.com/lot_oa_cleveland_hopkins_airport_brown_lot_parking_cle", "https://airportparkingreservations.com/lot_oa_cleveland_hopkins_international_airport_long_term_garage_cle", "https://airportparkingreservations.com/lot_oa_charlotte_douglas_international_airport_clt", "https://airportparkingreservations.com/lot_oa_colorado_springs_airport_long_term_cos", "https://airportparkingreservations.com/lot_doubletree_dfw_airport_hotel_dfw", "https://airportparkingreservations.com/lot_oa_dallas_ft_worth_airport_terminal_c_parking_dfw", "https://airportparkingreservations.com/lot_oa_dallas_ft_worth_airport_terminal_d_parking_dfw", "https://airportparkingreservations.com/lot_oa_dallas_ft_worth_airport_terminal_e_parking_dfw", "https://airportparkingreservations.com/lot_sheraton_dfw_airport_hotel_dfw", "https://airportparkingreservations.com/lot_the_westin_dfw", "https://airportparkingreservations.com/lot_dane_county_regional_airport_msn", "https://airportparkingreservations.com/lot_oa_reagan_national_airport_economy_parking_dca", "https://airportparkingreservations.com/lot_oa_reagan_national_airport_garage_dca", "https://airportparkingreservations.com/lot_oa_denver_international_airport_dia_covered_parking_den", "https://airportparkingreservations.com/lot_oa_denver_international_airport_dia_economy_parking_den", "https://airportparkingreservations.com/lot_oa_denver_international_airport_pikes_peak_parking_den", "https://airportparkingreservations.com/lot_oa_des_moines_international_airport_dsm", "https://airportparkingreservations.com/lot_oa_detroit_metropolitan_airport_north_terminal_parking_dtw", "https://airportparkingreservations.com/lot_oa_dtw_big_blue_deck_north_terminal_parking_garage_dtw", "https://airportparkingreservations.com/lot_oa_dtw_mcnamara_terminal_parking_garage_dtw", "https://airportparkingreservations.com/lot_oa_dulles_airport_economy_parking_iad", "https://airportparkingreservations.com/lot_oa_washington_dulles_international_airport_iad", "https://airportparkingreservations.com/lot_oa_economy_parking_fnt", "https://airportparkingreservations.com/lot_oa_long_term_parking_fnt", "https://airportparkingreservations.com/lot_oa_short_term_parking_fnt", "https://airportparkingreservations.com/lot_oa_ft_lauderdale_hollywood_international_airport_economy_parking_fll", "https://airportparkingreservations.com/lot_oa_ft_lauderdale_hollywood_international_airport_terminal_1_parking_fll", "https://airportparkingreservations.com/lot_oa_ft_lauderdale_hollywood_international_airport_terminal_4_parking_fll", "https://airportparkingreservations.com/lot_oa_ft_lauderdale_hollywood_international_airport_terminal_three_parking_fll", "https://airportparkingreservations.com/lot_oa_gerald_r_ford_international_airport_economy_parking_grr", "https://airportparkingreservations.com/lot_oa_gerald_r_ford_international_airport_long_term_parking_grr", "https://airportparkingreservations.com/lot_oa_airport_terminal_parking_yhz", "https://airportparkingreservations.com/lot_oa_harrisburg_airport_economy_parking_mdt", "https://airportparkingreservations.com/lot_oa_harrisburg_airport_parking_garage_mdt", "https://airportparkingreservations.com/lot_oa_william_p_hobby_airport_parking_garage_hou", "https://airportparkingreservations.com/lot_oa_george_bush_houston_intercontinental_airport_terminal_parking_iah", "https://airportparkingreservations.com/lot_red_roof_inn_iah", "https://airportparkingreservations.com/lot_oa_indianapolis_airport_parking_garage_ind", "https://airportparkingreservations.com/lot_oa_jacksonville_international_airport_daily_garage_jax", "https://airportparkingreservations.com/lot_oa_airport_parking_ylw", "https://airportparkingreservations.com/lot_country_inn_and_suites_tys", "https://airportparkingreservations.com/lot_oa_mcghee_tyson_airport_tys", "https://airportparkingreservations.com/lot_laguardia_airport_terminal_d_parking_lga", "https://airportparkingreservations.com/lot_oa_laguardia_airport_terminal_b_parking_lga", "https://airportparkingreservations.com/lot_smartpark_lga", "https://airportparkingreservations.com/lot_oa_mccarran_international_airport_long_term_garage_las", "https://airportparkingreservations.com/lot_oa_long_beach_airport_long_term_parking_lgb", "https://airportparkingreservations.com/lot_oa_long_beach_airport_valet_lgb", "https://airportparkingreservations.com/lot_oa_lax_central_terminal_area_lax", "https://airportparkingreservations.com/lot_oa_lax_economy_lot_e_lax", "https://airportparkingreservations.com/lot_oa_lax_economy_parking_lot_lax", "https://airportparkingreservations.com/lot_oa_lax_lot_c_lax", "https://airportparkingreservations.com/lot_oa_lax_terminal_5_parking_lax", "https://airportparkingreservations.com/lot_oa_louisville_international_airport_sdf", "https://airportparkingreservations.com/lot_oa_manchester_boston_regional_airport_long_term_mht", "https://airportparkingreservations.com/lot_oa_kansas_city_international_airport_garage_parking_mci", "https://airportparkingreservations.com/lot_oa_memphis_international_airport_long_term_mem", "https://airportparkingreservations.com/lot_oa_memphis_international_airport_mem", "https://airportparkingreservations.com/lot_oa_memphis_international_airport_short_term_mem", "https://airportparkingreservations.com/lot_miami_international_airport_dolphin_garage_and_flamingo_garage_mia", "https://airportparkingreservations.com/lot_oa_miami_airport_economy_parking_mia", "https://airportparkingreservations.com/lot_oa_minneapolis_st_paul_international_airport_humphrey_terminal_2_parking_msp", "https://airportparkingreservations.com/lot_oa_minneapolis_st_paul_international_airport_lindbergh_terminal_msp", "https://airportparkingreservations.com/lot_oa_general_mitchell_international_airport_mke", "https://airportparkingreservations.com/lot_oa_general_mitchell_international_airport_supersaver_mke", "https://airportparkingreservations.com/lot_oa_montgomery_regional_airport_long_term_parking_mgm", "https://airportparkingreservations.com/lot_oa_myrtle_beach_international_airport_long_term_lot_myr", "https://airportparkingreservations.com/lot_oa_newark_airport_terminal_c_parking_ewr", "https://airportparkingreservations.com/lot_oa_newark_liberty_international_airport_economy_daily_parking_lots_p1_p3_and_p4_ewr", "https://airportparkingreservations.com/lot_oa_newark_liberty_international_airport_economy_parking_lot_p6_ewr", "https://airportparkingreservations.com/lot_oa_newark_liberty_international_airport_parking_garage_ewr", "https://airportparkingreservations.com/lot_oa_louis_armstrong_new_orleans_international_airport_msy", "https://airportparkingreservations.com/lot_park_n_fly_msy", "https://airportparkingreservations.com/lot_oa_jfk_international_airport_cta_parking_green_blue_yellow_orange_and_red_jfk", "https://airportparkingreservations.com/lot_oa_jfk_international_airport_economy_parking_jfk", "https://airportparkingreservations.com/lot_oa_jfk_international_airport_long_term_parking_lot_9_jfk", "https://airportparkingreservations.com/lot_oa_jfk_international_airport_terminal_1_parking_jfk", "https://airportparkingreservations.com/lot_oa_jfk_international_airport_terminal_4_parking_jfk", "https://airportparkingreservations.com/lot_oa_jfk_international_airport_terminal_5_parking_jfk", "https://airportparkingreservations.com/lot_oa_norfolk_international_airport_long_term_parking_orf", "https://airportparkingreservations.com/lot_oa_oakland_international_airport_economy_parking_oak", "https://airportparkingreservations.com/lot_oa_will_rogers_world_airport_okc", "https://airportparkingreservations.com/lot_hotel_deco_xv_oma", "https://airportparkingreservations.com/lot_oa_eppley_airfield_north_long_term_economy_parking_oma", "https://airportparkingreservations.com/lot_oa_eppley_airfield_south_long_term_economy_parking_oma", "https://airportparkingreservations.com/lot_oa_omaha_eppley_airfield_garage_parking_oma", "https://airportparkingreservations.com/lot_oa_omaha_eppley_airfield_oma", "https://airportparkingreservations.com/lot_oa_ontario_international_airport_terminal_parking_ont", "https://airportparkingreservations.com/lot_john_wayne_airport_main_street_parking_sna", "https://airportparkingreservations.com/lot_oa_orlando_international_airport_economy_parking_mco", "https://airportparkingreservations.com/lot_oa_orlando_international_airport_hyatt_regency_parking_mco", "https://airportparkingreservations.com/lot_oa_orlando_international_airport_terminal_parking_mco", "https://airportparkingreservations.com/lot_oa_orlando_international_airport_terminal_parking_terminal_b_mco", "https://airportparkingreservations.com/lot_oa_portland_airport_parking_garage_pdx", "https://airportparkingreservations.com/lot_oa_philadelphia_airport_economy_parking_phl", "https://airportparkingreservations.com/lot_payless_airport_valet_parking_phl", "https://airportparkingreservations.com/lot_oa_phoenix_sky_harbor_international_airport_terminal_parking_phx", "https://airportparkingreservations.com/lot_pittsburgh_international_airport_long_term_pit", "https://airportparkingreservations.com/lot_oa_portland_international_jetport_pwm", "https://airportparkingreservations.com/lot_oa_providence_tf_green_daily_garage_pvd", "https://airportparkingreservations.com/lot_oa_raleigh_durham_international_airport_rdu", "https://airportparkingreservations.com/lot_oa_reno_tahoe_international_airport_long_term_parking_rno", "https://airportparkingreservations.com/lot_oa_richmond_international_airport_ric", "https://airportparkingreservations.com/lot_quality_inn_ric", "https://airportparkingreservations.com/lot_oa_sacramento_international_airport_smf", "https://airportparkingreservations.com/lot_oa_san_antonio_international_airport_sat", "https://airportparkingreservations.com/lot_san_park_harbordrive_san", "https://airportparkingreservations.com/lot_san_park_pacifichighway_san", "https://airportparkingreservations.com/lot_el_rancho_inn_bw_signature_collection_sfo", "https://airportparkingreservations.com/lot_oa_san_francisco_international_parking_garages_sfo", "https://airportparkingreservations.com/lot_oa_sfo_economy_parking_sfo", "https://airportparkingreservations.com/lot_oa_san_jose_international_airport_long_term_parking_sjc", "https://airportparkingreservations.com/lot_oa_san_jose_international_airport_lot_6_parking_sjc", "https://airportparkingreservations.com/lot_oa_san_jose_international_airport_terminal_a_garage_parking_sjc", "https://airportparkingreservations.com/lot_oa_san_jose_international_airport_terminal_b_garage_parking_sjc", "https://airportparkingreservations.com/lot_savannah_hilton_head_sav", "https://airportparkingreservations.com/lot_oa_seattle_tacoma_international_airport_long_term_parking_sea", "https://airportparkingreservations.com/lot_oa_spokane_airport_parking_geg", "https://airportparkingreservations.com/lot_oa_long_term_parking_pie", "https://airportparkingreservations.com/lot_oa_short_term_parking_pie", "https://airportparkingreservations.com/lot_remote_parking_pie", "https://airportparkingreservations.com/lot_oa_lambert_st_louis_international_airport_stl", "https://airportparkingreservations.com/lot_oa_st_louis_airport_parking_lot_c_stl", "https://airportparkingreservations.com/lot_oa_st_louis_airport_parking_lot_d_stl", "https://airportparkingreservations.com/lot_st_louis_airport_parking_lot_a_stl", "https://airportparkingreservations.com/lot_st_louis_airport_parking_lot_c_stl", "https://airportparkingreservations.com/lot_stlouis_airport_parking_lot_d_stl", "https://airportparkingreservations.com/lot_oa_syracuse_hancock_international_airport_syr", "https://airportparkingreservations.com/lot_oa_tampa_international_airport_tpa", "https://airportparkingreservations.com/lot_oa_tucson_international_airport_park_n_covered_save_lot_tus", "https://airportparkingreservations.com/lot_oa_tulsa_international_airport_tul", "https://airportparkingreservations.com/lot_robbins_parking_service_yyj", "https://airportparkingreservations.com/lot_oa_palm_beach_international_airport_economy_parking_pbi", "https://airportparkingreservations.com/lot_oa_palm_beach_international_airport_long_term_parking_pbi", "https://airportparkingreservations.com/lot_cambria_suites_white_plains_hpn", "https://airportparkingreservations.com/lot_oa_wichita_national_airport_long_term_parking_ict", "https://airportparkingreservations.com/lot_oa_winnipeg_airport_long_term_parking_ywg", "https://airportparkingreservations.com/lot_oa_toronto_pearson_parking_yyz"};
        return data;
    }
}